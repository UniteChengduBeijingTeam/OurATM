package com.chat.common.dao.impl;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.chat.bean.User_Relation;
import com.chat.common.dao.UserRelationMapper;

@Repository("userRelationMapper")
public class UserRelationMapperImpl implements UserRelationMapper {
	@Resource
	private SqlSessionTemplate sqlSessionTemplate;

	@Override
	public void saveUserRelation(User_Relation user_Relation) {
		sqlSessionTemplate.insert("com.chat.common.dao.UserRelationMapper.saveUserRelation",user_Relation);

	}

	@Override
	public void updateUserRelation(User_Relation t) {
		
		sqlSessionTemplate.update("com.chat.common.dao.UserRelationMapper.updateUserRelation",t);
	}

}
