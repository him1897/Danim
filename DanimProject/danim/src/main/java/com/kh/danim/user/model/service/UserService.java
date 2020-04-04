package com.kh.danim.user.model.service;

import com.kh.danim.user.model.vo.User;

public interface UserService {
	
	User loginCheck(User user);

	int insertUser(User user);

	User selectUser(String userid);
}
