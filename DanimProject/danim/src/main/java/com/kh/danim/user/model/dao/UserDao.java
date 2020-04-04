package com.kh.danim.user.model.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kh.danim.user.model.vo.User;

@Repository("userDao")
public class UserDao {
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	
	public User loginCheck(User user) {
		return sqlSession.selectOne("userMapper.loginCheck", user);
	}


	public int userInsert(User user) {
		return sqlSession.insert("userMapper.userInsert", user);
	}


	public User selectUser(String userid) {
		return sqlSession.selectOne("userMapper.userSelect", userid);
	}
}
