package com.chat.common.dao;


import com.chat.bean.User;

public interface UserMapper{
	
	void saveUser(User user);
	void updateUser(User user);
	
}
