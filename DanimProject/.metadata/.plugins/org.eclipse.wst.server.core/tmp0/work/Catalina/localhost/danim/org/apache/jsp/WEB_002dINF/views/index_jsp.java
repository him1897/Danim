/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.43
 * Generated at: 2019-10-23 00:11:44 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write(" \n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\t<head>\n");
      out.write("\t\t<meta charset=\"utf-8\">\n");
      out.write("\t\t<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("\t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\t\t\n");
      out.write("\n");
      out.write("\t\t<title>다님: 효율적인 삶의 시작</title>\n");
      out.write("\n");
      out.write("\t\t<!-- Google font -->\n");
      out.write("\t\t<link href=\"https://fonts.googleapis.com/css?family=Lato:700%7CMontserrat:400,600\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("\t\t<!-- Bootstrap -->\n");
      out.write("\t\t<link type=\"text/css\" rel=\"stylesheet\" href=\"resources/css/bootstrap.min.css\"/>\n");
      out.write("\n");
      out.write("\t\t<!-- Font Awesome Icon -->\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"resources/css/font-awesome.min.css\">\n");
      out.write("\n");
      out.write("\t\t<!-- Custom stlylesheet -->\n");
      out.write("\t\t<link type=\"text/css\" rel=\"stylesheet\" href=\"resources/css/style.css\"/>\n");
      out.write("\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"https://code.jquery.com/jquery-1.12.4.min.js\" ></script>\n");
      out.write("\t\t\n");
      out.write("\t\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\t<body>\n");
      out.write("\n");
      out.write("\t\t<!-- Header -->\n");
      out.write("\t\t<header id=\"header\" class=\"transparent-nav\">\n");
      out.write("\t\t\t<div class=\"container\">\n");
      out.write("\n");
      out.write("\t\t\t\t<div class=\"navbar-header\" class=\"backimgs\">\n");
      out.write("\t\t\t\t\t<!-- Logo -->\n");
      out.write("\t\t\t\t\t<div class=\"navbar-brand\">\n");
      out.write("\t\t\t\t\t\t<a class=\"logo\" href=\"index.do\">\n");
      out.write("\t\t\t\t\t\t\t<img src=\"resources/img/logo-alt.png\" alt=\"logo\">\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<!-- /Logo -->\n");
      out.write("\n");
      out.write("\t\t\t\t\t<!-- Mobile toggle -->\n");
      out.write("\t\t\t\t\t<button class=\"navbar-toggle\">\n");
      out.write("\t\t\t\t\t\t<span></span>\n");
      out.write("\t\t\t\t\t</button>\n");
      out.write("\t\t\t\t\t<!-- /Mobile toggle -->\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t<!-- Navigation -->\n");
      out.write("\t\t\t\t<nav id=\"nav\">\n");
      out.write("\t\t\t\t\t<ul class=\"main-menu nav navbar-nav navbar-right\">\n");
      out.write("\t\t\t\t\t\t<li><a href=\"index.do\">메인으로</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"loginForm.do\">로그인</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"enrollForm.do\">회원가입</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"contactForm.do\">문의하기</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"noticeForm.do?page=1\">공지사항</a></li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</nav>\n");
      out.write("\t\t\t\t<!-- /Navigation -->\n");
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</header>\n");
      out.write("\t\t<!-- /Header -->\n");
      out.write("\n");
      out.write("\t\t<!-- Home -->\n");
      out.write("\t\t<div id=\"home\" class=\"hero-area\">\n");
      out.write("\n");
      out.write("\t\t\t<!-- Backgound Image -->\n");
      out.write("\t\t\t<div class=\"bg-image bg-parallax overlay backimgs\" style=\"background-image:url(resources/img/IMG_0078.jpeg)\"></div>\n");
      out.write("\t\t\t<!-- /Backgound Image -->\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"home-wrapper\">\n");
      out.write("\t\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-8\">\n");
      out.write("\t\t\t\t\t\t\t<h1 class=\"white-text\">Danim:</h1>\n");
      out.write("\t\t\t\t\t\t\t<p class=\"lead white-text\">\n");
      out.write("\t\t\t\t\t\t\t\t'다님'은 실시간 GPS 기반 서비스 플랫폼입니다.\n");
      out.write("\t\t\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t\t\t<p class=\"lead white-text\">\n");
      out.write("\t\t\t\t\t\t\t\t여러분의 도움이 필요할 때 '다님이'들이 여러분의 니즈를 해결해 드립니다. 이젠 귀찮은 일, 힘든일 모두 안 하셔도 됩니다. '다님이'가 대신 해드릴테니까요.\n");
      out.write("\t\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t\t\t<br>\n");
      out.write("\t\t\t\t\t\t\t<a class=\"main-button icon-button\" href=\"loginForm.do\">지금 시작하기</a>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<!-- /Home -->\n");
      out.write("\n");
      out.write("\t\t<!-- About -->\n");
      out.write("\t\t<div id=\"about\" class=\"section\">\n");
      out.write("\n");
      out.write("\t\t\t<!-- container -->\n");
      out.write("\t\t\t<div class=\"container\">\n");
      out.write("\n");
      out.write("\t\t\t\t<!-- row -->\n");
      out.write("\t\t\t\t<div class=\"row\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"col-md-6\">\n");
      out.write("\t\t\t\t\t\t<div class=\"section-header\" id=\"about\">\n");
      out.write("\t\t\t\t\t\t\t<h2>다님: 의 다짐</h2>\n");
      out.write("\t\t\t\t\t\t\t<p class=\"lead\">'다님'은 서비스를 운영함에 앞서 유저분들에게 깨끗하고 당당한 서비스를 운영할 것을 약속합니다.</p>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<!-- feature -->\n");
      out.write("\t\t\t\t\t\t<div class=\"feature\">\n");
      out.write("\t\t\t\t\t\t\t<i class=\"feature-icon fa fa-flask\"></i>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"feature-content\">\n");
      out.write("\t\t\t\t\t\t\t\t<h4>첫 번째 다짐</h4>\n");
      out.write("\t\t\t\t\t\t\t\t<p>'다님'은 유저분들을 속이지 않습니다.</p>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<!-- /feature -->\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<!-- feature -->\n");
      out.write("\t\t\t\t\t\t<div class=\"feature\">\n");
      out.write("\t\t\t\t\t\t\t<i class=\"feature-icon fa fa-users\"></i>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"feature-content\">\n");
      out.write("\t\t\t\t\t\t\t\t<h4>두 번째 다짐</h4>\n");
      out.write("\t\t\t\t\t\t\t\t<p>'다님'은 유저분들의 사생활 및 개인정보를 동의없이 수집하거나 사용하지 않습니다.</p>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<!-- /feature -->\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<!-- feature -->\n");
      out.write("\t\t\t\t\t\t<div class=\"feature\">\n");
      out.write("\t\t\t\t\t\t\t<i class=\"feature-icon fa fa-comments\"></i>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"feature-content\">\n");
      out.write("\t\t\t\t\t\t\t\t<h4>세 번째 다짐</h4>\n");
      out.write("\t\t\t\t\t\t\t\t<p>'다님'은 유저분들에게 신뢰를 져버리지 않도록 노력하겠습니다.</p>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<!-- /feature -->\n");
      out.write("\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"col-md-6\">\n");
      out.write("\t\t\t\t\t\t<div class=\"about-img backimgs\"\">\n");
      out.write("\t\t\t\t\t\t\t<img src=\"resources/img/about.png\" alt=\"\">\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<!-- row -->\n");
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<!-- container -->\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<!-- /About -->\n");
      out.write("\n");
      out.write("\t\t<!-- Courses -->\n");
      out.write("\t\t<div id=\"courses\" class=\"section\">\n");
      out.write("\n");
      out.write("\t\t\t<!-- container -->\n");
      out.write("\t\t\t<div class=\"container\">\n");
      out.write("\n");
      out.write("\t\t\t\t<!-- row -->\n");
      out.write("\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t<div class=\"section-header text-center\" id=\"service\">\n");
      out.write("\t\t\t\t\t\t<h2>주요 서비스</h2>\n");
      out.write("\t\t\t\t\t\t<p class=\"lead\">'다님'에서는 다른 플랫폼들과 다르게 투명한 서비스 운영을 추구합니다.</p>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<!-- /row -->\n");
      out.write("\n");
      out.write("\t\t\t\t<!-- courses -->\n");
      out.write("\t\t\t\t<div id=\"courses-wrapper\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t<!-- row -->\n");
      out.write("\t\t\t\t\t<div class=\"row\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<!-- single course -->\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-3 col-sm-6 col-xs-6\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"course\">\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\" class=\"course-img\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<img src=\"resources/img/img3.jpeg\" alt=\"\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<!-- <i class=\"course-link-icon fa fa-link\"></i> -->\n");
      out.write("\t\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t\t\t<a class=\"course-title\" href=\"#\">전문가/비즈니스</a>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"course-details\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"course-category\">Professional</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"course-price course-premium\">₩30,000원 ~</span>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<!-- /single course -->\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<!-- single course -->\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-3 col-sm-6 col-xs-6\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"course\">\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\" class=\"course-img\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<img src=\"resources/img/img1.jpeg\" alt=\"\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t\t\t<a class=\"course-title\" href=\"#\">하객 역할 해주기</a>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"course-details\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"course-category\">Visitor</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"course-price course-premium\">₩10,000원 ~</span>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<!-- /single course -->\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<!-- single course -->\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-3 col-sm-6 col-xs-6\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"course\">\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\" class=\"course-img\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<img src=\"resources/img/img8.jpeg\" alt=\"\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t\t\t<a class=\"course-title\" href=\"#\">이사 도와주기</a>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"course-details\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"course-category\">Help Move</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"course-price course-premium\">₩10,000원 ~</span>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<!-- /single course -->\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-3 col-sm-6 col-xs-6\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"course\">\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\" class=\"course-img\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<img src=\"resources/img/img5.jpeg\" alt=\"\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t\t\t<a class=\"course-title\" href=\"#\">애완동물 돌봐주기</a>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"course-details\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"course-category\">Pet Care</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"course-price course-premium\">₩10,000원 ~</span>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<!-- /single course -->\n");
      out.write("\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<!-- /row -->\n");
      out.write("\n");
      out.write("\t\t\t\t\t<!-- row -->\n");
      out.write("\t\t\t\t\t<div class=\"row\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<!-- single course -->\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-3 col-sm-6 col-xs-6\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"course\">\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\" class=\"course-img\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<img src=\"resources/img/img4.jpeg\" alt=\"\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t\t\t<a class=\"course-title\" href=\"#\">줄 서주기</a>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"course-details\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"course-category\">Waiting</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"course-price course-free\">₩5,000원 ~</span>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<!-- /single course -->\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<!-- single course -->\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-3 col-sm-6 col-xs-6\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"course\">\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\" class=\"course-img\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<img src=\"resources/img/img2.jpeg\" alt=\"\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t\t\t<a class=\"course-title\" href=\"#\">약 사다주기</a>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"course-details\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"course-category\">Medichine</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"course-price course-free\">₩3,000원 ~</span>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<!-- /single course -->\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<!-- single course -->\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-3 col-sm-6 col-xs-6\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"course\">\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\" class=\"course-img\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<img src=\"resources/img/img6.jpeg\" alt=\"\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t\t\t<a class=\"course-title\" href=\"#\">물건 맡아주기 및 찾아주기</a>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"course-details\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"course-category\">Leave</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"course-price course-free\">₩3,000원 ~</span>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<!-- /single course -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<!-- single course -->\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-3 col-sm-6 col-xs-6\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"course\">\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\" class=\"course-img\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<img src=\"resources/img/img7.jpeg\" alt=\"\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t\t\t<a class=\"course-title\" href=\"#\">서류 및 물건 배달</a>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"course-details\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"course-category\">Delivery</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"course-price course-free\">₩3,000원 ~</span>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<!-- /single course -->\n");
      out.write("\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<!-- /row -->\n");
      out.write("\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<!-- /courses -->\n");
      out.write("\n");
      out.write("\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t<div class=\"center-btn\">\n");
      out.write("\t\t\t\t\t\t<a class=\"main-button icon-button\" href=\"loginForm.do\">다양한 서비스 이용하기</a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<!-- container -->\n");
      out.write("\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<!-- /Courses -->\n");
      out.write("\n");
      out.write("\t\t<!-- Call To Action -->\n");
      out.write("\t\t<div id=\"cta\" class=\"section\">\n");
      out.write("\n");
      out.write("\t\t\t<!-- Backgound Image -->\n");
      out.write("\t\t\t<div class=\"bg-image bg-parallax overlay backimgs\" style=\"background-image:url(resources/img/IMG_0067.jpeg)\"></div>\n");
      out.write("\t\t\t<!-- /Backgound Image -->\n");
      out.write("\n");
      out.write("\t\t\t<!-- container -->\n");
      out.write("\t\t\t<div class=\"container\">\n");
      out.write("\n");
      out.write("\t\t\t\t<!-- row -->\n");
      out.write("\t\t\t\t<div class=\"row\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"col-md-6\">\n");
      out.write("\t\t\t\t\t\t<h2 class=\"white-text\">나의 시간이 주변 누군가에게 당장 꼭 필요하다면!?</h2>\n");
      out.write("\t\t\t\t\t\t<p class=\"lead white-text\">'다님:'에서는 항상 다님의 서포터 '다님이'를 모집하고 있습니다.\n");
      out.write("\t\t\t\t\t\t\t'다님이'는 부업 또는 전업으로 고객들의 니즈를 해결하여 수익을 창출하실 수 있습니다.\n");
      out.write("\t\t\t\t\t\t\t간단한 심부름, 청소, 못박기부터 번역, 과외, 아이들 돌보미등 여러분이 하실 수 있는 일들은 많습니다.\n");
      out.write("\t\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t\t<a class=\"main-button icon-button\" href=\"loginForm.do\">'다님이' 등록하기</a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<!-- /row -->\n");
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<!-- /container -->\n");
      out.write("\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<!-- /Call To Action -->\n");
      out.write("\n");
      out.write("\t\t<!-- Why us -->\n");
      out.write("\t\t<div id=\"why-us\" class=\"section\">\n");
      out.write("\n");
      out.write("\t\t\t<!-- container -->\n");
      out.write("\t\t\t<div class=\"container\">\n");
      out.write("\n");
      out.write("\t\t\t\t<!-- row -->\n");
      out.write("\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t<div class=\"section-header text-center\">\n");
      out.write("\t\t\t\t\t\t<h2>왜 '다님' 인가요?</h2>\n");
      out.write("\t\t\t\t\t\t<p class=\"lead\">'다님'은 '사람들이 걸어 다니는'이라는 순우리말 입니다.</p>\n");
      out.write("\t\t\t\t\t\t<p class=\"lead\">이름의 뜻처럼 많은 사람들이 자연스럽게 본인의 시간을 할애할 수 있도록 최적의 서비스를 제공하는 것이 저희 '다님'의 모토입니다.</p>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<!-- /container -->\n");
      out.write("\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<!-- /Why us -->\n");
      out.write("\n");
      out.write("\t\t<!-- Contact CTA -->\n");
      out.write("\t\t<div id=\"contact-cta\" class=\"section\">\n");
      out.write("\n");
      out.write("\t\t\t<!-- Backgound Image -->\n");
      out.write("\t\t\t<div class=\"bg-image bg-parallax overlay backimgs\" style=\"background-image:url(resources/img/IMG_1805.jpeg)\"></div>\n");
      out.write("\t\t\t<!-- Backgound Image -->\n");
      out.write("\n");
      out.write("\t\t\t<!-- container -->\n");
      out.write("\t\t\t<div class=\"container\">\n");
      out.write("\n");
      out.write("\t\t\t\t<!-- row -->\n");
      out.write("\t\t\t\t<div class=\"row\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"col-md-8 col-md-offset-2 text-center\">\n");
      out.write("\t\t\t\t\t\t<h2 class=\"white-text\">문의 하기</h2>\n");
      out.write("\t\t\t\t\t\t<p class=\"lead white-text\">서비스 이용에 문제가 있으시거나 궁금하신 점이 있으시다면 언제든지 연락주세요.</p>\n");
      out.write("\t\t\t\t\t\t<a class=\"main-button icon-button\" href=\"contact.jsp\">개발자에게 문의 하기</a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<!-- /row -->\n");
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<!-- /container -->\n");
      out.write("\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<!-- /Contact CTA -->\n");
      out.write("\n");
      out.write("\t\t<!-- Footer -->\n");
      out.write("\t\t<footer id=\"footer\" class=\"section\">\n");
      out.write("\n");
      out.write("\t\t\t<!-- container -->\n");
      out.write("\t\t\t<div class=\"container\">\n");
      out.write("\n");
      out.write("\t\t\t\t<!-- row -->\n");
      out.write("\t\t\t\t<div class=\"row\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t<!-- footer logo -->\n");
      out.write("\t\t\t\t\t<div class=\"col-md-6\">\n");
      out.write("\t\t\t\t\t\t<div class=\"footer-logo\">\n");
      out.write("\t\t\t\t\t\t\t<a class=\"logo\" href=\"index.do\">\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"resources/img/logo.png\" alt=\"logo\">\n");
      out.write("\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<!-- /row -->\n");
      out.write("\n");
      out.write("\t\t\t\t<!-- row -->\n");
      out.write("\t\t\t\t<div id=\"bottom-footer\" class=\"row\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t<!-- social -->\n");
      out.write("\t\t\t\t\t<div class=\"col-md-4 col-md-push-8\">\n");
      out.write("\t\t\t\t\t\t<ul class=\"footer-social\">\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\" class=\"facebook\"><i class=\"fa fa-facebook\"></i></a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\" class=\"instagram\"><i class=\"fa fa-instagram\"></i></a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\" class=\"github\"><i class=\"fa fa-github\"></i></a></li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<!-- /social -->\n");
      out.write("\n");
      out.write("\t\t\t\t\t<!-- copyright -->\n");
      out.write("\t\t\t\t\t<div class=\"col-md-8 col-md-pull-4\">\n");
      out.write("\t\t\t\t\t\t<div class=\"footer-copyright\">\n");
      out.write("\t\t\t\t\t\t\t<span>&copy; Copyright Koo gun mo. | This Poroject is made with Kim nam gyu & You young joon</a></span>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<!-- /copyright -->\n");
      out.write("\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<!-- row -->\n");
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<!-- /container -->\n");
      out.write("\n");
      out.write("\t\t</footer>\n");
      out.write("\t\t<!-- /Footer -->\n");
      out.write("\n");
      out.write("\t\t<!-- preloader -->\n");
      out.write("\t\t<div id='preloader'><div class='preloader'></div></div>\n");
      out.write("\t\t<!-- /preloader -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t<!-- jQuery Plugins -->\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"resources/js/jquery.min.js\"></script>\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"resources/js/bootstrap.min.js\"></script>\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"resources/js/main.js\"></script>\n");
      out.write("\n");
      out.write("\t</body>\n");
      out.write("</html>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
