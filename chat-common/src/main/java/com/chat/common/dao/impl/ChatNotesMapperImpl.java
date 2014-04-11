package com.chat.common.dao.impl;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.chat.bean.Chat_Notes;
import com.chat.common.dao.ChatNotesMapper;

@Repository("chatNotesMapper")
public class ChatNotesMapperImpl implements ChatNotesMapper{
	@Resource
	private SqlSessionTemplate sqlSessionTemplate;
	@Override
	public void saveChatNotes(Chat_Notes chat_Notes) {
		sqlSessionTemplate.insert("com.chat.common.dao.ChatNotesMapper.saveChatNotes", chat_Notes);
	}
	

	
}
