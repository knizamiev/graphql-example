package com.techshard.graphql.service;

import com.techshard.graphql.model.Book;

import java.util.List;

public interface BookF {

    Book getBook();

    List<Book> getBooks();

    String createBook();

}
