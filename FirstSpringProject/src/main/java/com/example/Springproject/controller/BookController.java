package com.example.Springproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Springproject.service.BookService;

@RestController
@RequestMapping("/api")
public class BookController {
	
	//@Autowired
	//private BookService bookservice;
	
	@GetMapping
	public String home(){
		
		return "Welcome to the Book Api";
	}
//	@GetMapping("/findById/{id}")
//	public Book findBookById(@PathVariable int id) {
//		
//		return bookservice.findBookById(id);
//	}
	

}
