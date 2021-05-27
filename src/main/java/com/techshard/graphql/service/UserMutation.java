package com.techshard.graphql.service;

import com.techshard.graphql.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserMutation {

	@Autowired
	private UserDao userDao;

	public String createUser(){
		return userDao.createUser();
	}
}
