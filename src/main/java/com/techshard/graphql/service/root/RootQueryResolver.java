package com.techshard.graphql.service.root;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.techshard.graphql.service.BookService;
import com.techshard.graphql.service.UserService;
import org.springframework.stereotype.Component;

@Component
public class RootQueryResolver implements GraphQLQueryResolver {

	private final BookService service;
	private final UserService userService;


	public RootQueryResolver(BookService service, UserService userService) {
		this.service = service;
		this.userService = userService;
	}

	public BookService book() {
		return service;
	}

	public UserService user() {
		return userService;
	}

}