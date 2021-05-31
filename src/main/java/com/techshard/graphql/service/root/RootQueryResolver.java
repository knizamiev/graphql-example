package com.techshard.graphql.service.root;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.techshard.graphql.service.user.UserMutationService;
import com.techshard.graphql.service.user.UserQueryService;
import com.techshard.graphql.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RootQueryResolver implements GraphQLQueryResolver {

	@Autowired
	private UserService userService;

	public UserQueryService user() {
		return userService;
	}


}