package com.techshard.graphql.service;


import com.techshard.graphql.dao.UserDao;
import com.techshard.graphql.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
public class UserQuery {

	@Autowired
	private UserDao userDao;

	public User getUser(){
		return userDao.findUser();
	}

	public List<User> getUsers(){
		return userDao.findUsers();
	}

}
