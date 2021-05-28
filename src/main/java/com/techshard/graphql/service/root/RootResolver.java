package com.techshard.graphql.service.root;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.techshard.graphql.service.BookService;
import com.techshard.graphql.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RootResolver implements GraphQLQueryResolver, GraphQLMutationResolver {

	@Autowired
	private BookService service;
	@Autowired
	private UserService userService;

	public BookService book() {
		return service;
	}

	public UserService user() {
		return userService;
	}

}