package com.kh.danim.user.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;
import java.util.Random;

import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.kh.danim.key.model.service.EmailKeyService;
import com.kh.danim.user.model.service.UserService;
import com.kh.danim.user.model.vo.User;

@Controller
public class UserController {

	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	@Autowired
	private UserService userService;


	@Autowired
	private EmailKeyService key;

	@RequestMapping("enrollForm.do")
	public String enrollFormMethod() {
//		logger.info("회원가입 페이지 접속..");
		return "enroll";
	}

	@RequestMapping("loginForm.do")
	public String loginFormMethod() {
//		logger.info("로그인 페이지 접속..");
		return "login";
	}
	
//	@RequestMapping("myinfomodify.do")
//	public String myInfoModifyMethod() {
//		return "myinfomodify";
//	}

//	@RequestMapping("noticeForm.do")
//	public String noticeFormMethod() {
//		logger.info("공지사항 페이지 접속..");
//		return "notice/Notice";
//	}

	@RequestMapping("contactForm.do")
	public String contactFormMethod() {
//		logger.info("문의하기 페이지 접속..");
		return "contact";
	}

	@RequestMapping("danimChange.do")
	public String danimChangeMethod() {
//		logger.info("다님이 페이지 접속..");
		return "danimindex";
	}

	@RequestMapping("userChange.do")
	public String userChangeMethod() {
//		logger.info("이용자 페이지 접속..");
		return "userindex";
	}

//	@RequestMapping("myPage.do")
//	public String myPageMethod() {
//		logger.info("마이페이지 접속..");
//		return "mypage";
//	}

	@RequestMapping("logout.do")
	public String logoutMethod(HttpServletRequest request) {
		HttpSession session = request.getSession(false); // Session이 없으면 null 리턴

		if (session != null)
			session.invalidate();

		return "index";
	}

	@RequestMapping(value = "login.do", method = RequestMethod.POST)
	public String loginMethod(User user, HttpSession session) {
		logger.info("로그인 시도..");
		
//		User loginUser = userService.loginCheck(user);
		User loginUser = userService.selectUser(user.getUserid());
		
		String link = "userindex";

		if (loginUser != null && bCryptPasswordEncoder.matches(user.getUserpwd(), loginUser.getUserpwd()) == true)
			session.setAttribute("loginUser", loginUser);
		else {
			session.setAttribute("loginstatus", "fail");
			link = "login";
		}
		return link;
	}

	@RequestMapping(value = "emailSMTP.do", method = RequestMethod.POST)
	public void emailSMTP(@RequestParam("email") String to_email, HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		logger.info("이메일 인증이 시작되었습니다.");

		// mail server 설정
		String host = "smtp.naver.com";
		String user = "rpfpsrjsah"; // 계정
		String password = "dkdrjsahEl";// 패스워드
		String resultCd = "100";
		response.setCharacterEncoding("utf-8");

		PrintWriter out = response.getWriter();

		logger.info("이메일 : " + to_email);
		// TODO DB id Check
		// rescultCd = "200"; (중복사용중)

		if (resultCd.equals("100")) {
			Properties props = new Properties();
			props.put("mail.smtp.host", host);
			props.put("mail.smtp.port", 465);
			props.put("mail.smtp.auth", "true");
			props.put("mail.smtp.ssl.enable", "true");

			// 인증 번호 생성기
			StringBuffer temp = new StringBuffer();
			Random rnd = new Random();
			for (int i = 0; i < 10; i++) {
				int rIndex = rnd.nextInt(3);
				switch (rIndex) {
				case 0:
					// a-z
					temp.append((char) ((int) (rnd.nextInt(26)) + 97));
					break;
				case 1:
					// A-Z
					temp.append((char) ((int) (rnd.nextInt(26)) + 65));
					break;
				case 2:
					// 0-9
					temp.append((rnd.nextInt(10)));
					break;
				}
			}
			String AuthenticationKey = temp.toString();
			logger.info("인증번호 : " + AuthenticationKey);

			key.insertKey(AuthenticationKey);

			Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
				protected PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication(user, password);
				}
			});

			// email 전송
			try {
				MimeMessage msg = new MimeMessage(session);
				msg.setFrom(new InternetAddress(user, "Danim"));
				msg.addRecipient(Message.RecipientType.TO, new InternetAddress(to_email));

				// 메일 제목
				msg.setSubject("Danim 인증번호 입니다.");
				// 메일 내용
				msg.setText("인증 번호 : " + temp);

				Transport.send(msg);
			} catch (Exception e) {
				resultCd = "900";
				e.printStackTrace();// TODO: handle exception
			}
		}

		out.write(resultCd);
		out.flush();
		out.close();
	}


	
	@RequestMapping(value = "userInsert.do", method = RequestMethod.POST)
	public String userInsertMethod(HttpServletRequest request, User user, Model model, @RequestParam("userid") String userid) {
		
		logger.info("회원 등록중..");
		logger.info(user.getUserid());
		String link = "login";
		
		user.setUserpwd(bCryptPasswordEncoder.encode(user.getUserpwd()));
		
		logger.info(user.getUserpwd());

		int result = userService.insertUser(user);

		if (result <= 0) {
			model.addAttribute("message", "회원가입 실패");
			link = "common/error";
		}

		return link;
	}
	
	@RequestMapping("myPage.do")
	public ModelAndView myPageMethod(@RequestParam("userid") String userid, ModelAndView mv) {
		
		User user = userService.selectUser(userid);
		
		if(user != null) {
			mv.addObject("user",user);
			mv.setViewName("mypage");
		}
		
		return mv;
	}
	
	@RequestMapping("myPageModify.do")
	public ModelAndView myPageModifyMethod(@RequestParam("userid") String userid, ModelAndView mv) {
		
		User user = userService.selectUser(userid);
		
		if(user != null) {
			mv.addObject("user",user);
			mv.setViewName("myinfomodify");
		}
		
		return mv;
	}

}
