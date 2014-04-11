package com.chat.bean;

import java.util.Date;

public class Chat_Notes{

	// CREATE TABLE `chat_notes` (
	// `user_id_from` bigint(20) NOT NULL COMMENT '发送消息用户',
	// `user_id_to` bigint(20) NOT NULL COMMENT '接收消息的用户',
	// `chat_detail` varchar(255) NOT NULL COMMENT '聊天记录',
	// `send_time` datetime NOT NULL
	// ) ENGINE=InnoDB DEFAULT CHARSET=utf8
	private long id;
	private long user_id_from;
	private long user_id_to;
	private String chat_detail;
	private Date send_time;

	public long getUser_id_from() {
		return user_id_from;
	}

	public void setUser_id_from(long user_id_from) {
		this.user_id_from = user_id_from;
	}

	public long getUser_id_to() {
		return user_id_to;
	}

	public void setUser_id_to(long user_id_to) {
		this.user_id_to = user_id_to;
	}

	public String getChat_detail() {
		return chat_detail;
	}

	public void setChat_detail(String chat_detail) {
		this.chat_detail = chat_detail;
	}

	public Date getSend_time() {
		return send_time;
	}

	public void setSend_time(Date send_time) {
		this.send_time = send_time;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	
}
