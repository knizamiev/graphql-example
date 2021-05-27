package com.techshard.graphql.service;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

@Component
public class RootQueryResolver implements GraphQLQueryResolver {

	public Object bookQuery() {
		return new Object();
	}
}