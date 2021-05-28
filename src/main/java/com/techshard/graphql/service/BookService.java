package com.techshard.graphql.service;

import com.techshard.graphql.dao.BookDao;
import com.techshard.graphql.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
public class BookService {

	@Autowired
	private BookDao bookDao;

	public Book getBook(){
		return bookDao.findBook();
	}

	public List<Book> getBooks(){
		return bookDao.findBooks();
	}

	public String createBook(){
		return bookDao.createBook();
	}
}
