package com.techshard.graphql.service;

import com.techshard.graphql.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BookMutation {

	@Autowired
	private BookDao bookDao;

	public String createBook() {
		return bookDao.createBook();
	}
}
