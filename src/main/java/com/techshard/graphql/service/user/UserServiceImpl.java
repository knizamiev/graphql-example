package com.techshard.graphql.service.user;

import com.techshard.graphql.dao.UserDAO;
import com.techshard.graphql.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDAO userDAO;

	public User getUser(){
		return userDAO.findUser();
	}

	public List<User> getUsers(){
		return userDAO.findUsers();
	}

	public String createUser(){
		return userDAO.createUser();
	}

}
