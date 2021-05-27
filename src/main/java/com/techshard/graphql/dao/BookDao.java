package com.techshard.graphql.dao;

import com.techshard.graphql.model.Book;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class BookDao {

	public Book findBook(){
		return new Book(1, "Test book");
	}

	public List<Book> findBooks(){
		List<Book> rs = new ArrayList<>();

		rs.add(new Book(1,"Test book 1"));
		rs.add(new Book(2,"Test book 2"));
		rs.add(new Book(3,"Test book 3"));
		return rs;
	}

	public String createBook(){
		return "Hello";
	}
}
