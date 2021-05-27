package com.techshard.graphql.dao;

import com.techshard.graphql.model.Book;
import com.techshard.graphql.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserDao {
	public User findUser(){
		return new User(1,"qwer", false);
	}

	public List<User> findUsers(){
		List<User> rs = new ArrayList<>();

		rs.add(new User(1,"Test book 1", true));
		rs.add(new User(2,"Test book 2", false));
		rs.add(new User(3,"Test book 3",true));
		return rs;
	}

	public String createUser(){
		return "Hello";
	}
}
