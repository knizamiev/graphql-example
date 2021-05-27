package com.techshard.graphql.service.root;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.techshard.graphql.service.BookF;
import com.techshard.graphql.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RootQueryResolver implements GraphQLQueryResolver, GraphQLMutationResolver {

	@Autowired
	private BookF bookF;

	public BookF book() {
		return bookF;
	}

}