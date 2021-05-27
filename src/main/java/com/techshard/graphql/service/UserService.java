package com.techshard.graphql.service;

import com.techshard.graphql.dao.UserDao;
import com.techshard.graphql.model.Book;
import com.techshard.graphql.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

	@Autowired
	private UserDao userDao;

	public User getUser(){
		return userDao.findUser();
	}

	public List<User> getUsers(){
		return userDao.findUsers();
	}

	public String createUser(){
		return userDao.createUser();
	}
}
