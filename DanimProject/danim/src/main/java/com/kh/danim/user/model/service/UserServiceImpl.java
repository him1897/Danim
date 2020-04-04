package com.kh.danim.user.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kh.danim.user.model.dao.UserDao;
import com.kh.danim.user.model.vo.User;

@Service("userService")
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserDao userDao;

	@Override
	public int insertUser(User user) {
		return userDao.userInsert(user);
	}

	@Override
	public User loginCheck(User user) {
		return userDao.loginCheck(user);
	}

	@Override
	public User selectUser(String userid) {
		return userDao.selectUser(userid);
	}
}
