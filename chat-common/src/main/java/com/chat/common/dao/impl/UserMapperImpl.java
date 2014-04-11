package com.chat.common.dao.impl;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.chat.bean.User;
import com.chat.common.dao.UserMapper;


@Repository("userMapper")
public class UserMapperImpl implements UserMapper{
	@Resource
	private SqlSessionTemplate sqlSessionTemplate;
	
	@Override
	public void saveUser(User user) {
		
		sqlSessionTemplate.insert("com.chat.common.dao.UserMapper.saveUser",user);
		
	}

	@Override
	public void updateUser(User user) {
		
		sqlSessionTemplate.update("com.chat.common.dao.UserMapper.updateUser", user);
	}
	

}
