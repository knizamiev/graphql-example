package com.techshard.graphql.service.root;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.techshard.graphql.service.BookMutation;
import com.techshard.graphql.service.BookQuery;
import com.techshard.graphql.service.UserMutation;
import com.techshard.graphql.service.UserQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RootMutationResolver implements GraphQLMutationResolver {

	@Autowired
	private BookMutation service;

	@Autowired
	private UserMutation userService;

	public BookMutation book() {
		return service;
	}

	public UserMutation user() {
		return userService;
	}
}
