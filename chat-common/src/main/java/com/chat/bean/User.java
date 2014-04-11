package com.chat.bean;

import java.util.Date;

public class User{

	// CREATE TABLE `user` (
	// `id` bigint(20) NOT NULL AUTO_INCREMENT,
	// `number` bigint(20) NOT NULL COMMENT '系统随即生成的号码',
	// `nick_name` varchar(255) NOT NULL COMMENT '昵称',
	// `email` varchar(255) NOT NULL COMMENT '邮件',
	// `create_time` datetime NOT NULL COMMENT '用户创建时间',
	// `password` varchar(255) NOT NULL COMMENT '密码',
	// PRIMARY KEY (`id`)
	// ) ENGINE=InnoDB DEFAULT CHARSET=utf8

	private long id;
	private long number;
	private String nick_name;
	private String email;
	private Date create_time;
	private String password;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}

	public String getNick_name() {
		return nick_name;
	}

	public void setNick_name(String nick_name) {
		this.nick_name = nick_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
