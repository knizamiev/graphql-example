package com.techshard.graphql.service.root;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.techshard.graphql.service.user.UserMutationService;
import com.techshard.graphql.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RootMutationResolver implements GraphQLMutationResolver {

	@Autowired
	private UserService userService;

	public UserMutationService user() {
		return userService;
	}

}
