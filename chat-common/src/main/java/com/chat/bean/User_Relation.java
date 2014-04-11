package com.chat.bean;

import java.util.Date;

public class User_Relation{
//
//	CREATE TABLE `user_relation` (
//			  `user_id` bigint(20) NOT NULL COMMENT '用户Id',
//			  `relation_user_id` bigint(20) NOT NULL COMMENT '好友 陌生人 黑名单 用户ID',
//			  `relation` tinyint(4) NOT NULL DEFAULT '0' COMMENT '0 好友 1 陌生人 2 黑名单 ',
//			  `create_time` datetime NOT NULL COMMENT '加好友的时间'
//			) ENGINE=InnoDB DEFAULT CHARSET=utf8
	private long id;
	

	private long user_id;
	private long relation_user_id;
	private int relation;
	private Date create_time;

	public long getUser_id() {
		return user_id;
	}

	public void setUser_id(long user_id) {
		this.user_id = user_id;
	}

	public long getRelation_user_id() {
		return relation_user_id;
	}

	public void setRelation_user_id(long relation_user_id) {
		this.relation_user_id = relation_user_id;
	}

	public int getRelation() {
		return relation;
	}

	public void setRelation(int relation) {
		this.relation = relation;
	}

	public Date getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
}
