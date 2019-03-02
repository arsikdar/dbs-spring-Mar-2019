package com.example.annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class BookService {
	
	@Autowired
	@Qualifier("bookDAO")
	BookDAO bookDAO;
	
	
	public BookService() {
		System.out.println("Inside BookService()!!!!!");
	}

	@PostConstruct
	public void init() {
		System.out.println("Inside BookService.init()!!!!!");
	}

	@PreDestroy
	public void clean() {
		System.out.println("Inside BookService.clean()!!!!!");
	}

	public void addBook() {
		System.out.println("Inside BookService.addBook()!!!!!");
		bookDAO.save();
	}

	public void listBooks() {
		System.out.println("Inside BookService.listBooks()!!!!!");
		bookDAO.selectAll();
	}
}
