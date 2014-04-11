package com.chat.test.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.chat.bean.Chat_Notes;
import com.chat.common.dao.ChatNotesMapper;

public class Test {

	static ApplicationContext  ac = null;
	static{
		ac = new ClassPathXmlApplicationContext("spring-common.xml");
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		UserMapper userMapper = (UserMapper) ac.getBean("userMapper");
//		User user = new User();
//		user.setEmail("111");
//		user.setNumber(123123);
//		user.setNick_name("1111");
//		user.setPassword("123123");
//		userMapper.saveUser(user);
		//userMapper.update(user);
//		UserRelationMapper userRelationMapper = (UserRelationMapper) ac.getBean("userRelationMapper");
//		
//		User_Relation t = new User_Relation();
//		t.setId(3);
//		t.setRelation(6);
//		t.setRelation_user_id(2);
//		t.setUser_id(3);
//		
//		userRelationMapper.updateUserRelation(t);
		//userRelationMapper.saveUserRelation(t);
		ChatNotesMapper  cnm = (ChatNotesMapper) ac.getBean("chatNotesMapper");
		Chat_Notes chat_Notes= new Chat_Notes();
		chat_Notes.setChat_detail("ok");
		chat_Notes.setUser_id_from(1);
		chat_Notes.setUser_id_to(2);
		System.out.println(222);
		cnm.saveChatNotes(chat_Notes);
		System.out.println(111);
		
	}

}
