package com.techshard.graphql.service.root;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.techshard.graphql.service.BookService;
import com.techshard.graphql.service.UserService;
import org.springframework.stereotype.Component;

@Component
public class RootMutationResolver implements GraphQLMutationResolver {

	private final BookService service;
	private final UserService userService;

	public RootMutationResolver(BookService service, UserService userService) {
		this.service = service;
		this.userService = userService;
	}


	public BookService bookTest() {
		return service;
	}

	public UserService userTest() {
		return userService;
	}
}
