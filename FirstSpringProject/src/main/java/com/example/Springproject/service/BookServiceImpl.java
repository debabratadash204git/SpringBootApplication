package com.example.Springproject.service;

import java.util.ArrayList;
import java.util.List;

import com.example.Springproject.model.Book;

public class BookServiceImpl implements BookService {

	private List<Book> bookList;
	
	public List<Book> findAllBooks() {
		
		if(bookList == null) {
			bookList = new ArrayList<>();
		}
		return bookList;
	}

	public Book findBookById(int id) {
		
		return null;
	}

	
	public void deleteAllBooks() {

	}

}
