package com.example.Springproject.service;

import java.util.List;

import com.example.Springproject.model.Book;

public interface BookService {
	
	List<Book> findAllBooks();
	Book findBookById(int id);
	void deleteAllBooks();

}
