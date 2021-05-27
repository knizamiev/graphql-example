package com.techshard.graphql.service.root;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.techshard.graphql.service.BookQuery;
import com.techshard.graphql.service.UserQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RootQueryResolver implements GraphQLQueryResolver {

	@Autowired
	private BookQuery service;
	@Autowired
	private UserQuery userService;

	public BookQuery book() {
		return service;
	}

	public UserQuery user() {
		return userService;
	}

}