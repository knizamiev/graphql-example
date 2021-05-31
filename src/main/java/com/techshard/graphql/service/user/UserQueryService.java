package com.techshard.graphql.service.user;

import com.techshard.graphql.model.User;

import java.util.List;

public interface UserQueryService {

	User getUser();

	List<User> getUsers();

}
