package com.example.lifecycle;

public class BookService {
	
	public BookService() {
		System.out.println("Inside BookService()!!!!!");
	}

	public void init() {
		System.out.println("Inside BookService.init()!!!!!");
	}

	public void clean() {
		System.out.println("Inside BookService.clean()!!!!!");
	}
	
	public void addBook() {
		System.out.println("Inside BookService.addBook()!!!!!");
	}

	public void listBooks() {
		System.out.println("Inside BookService.listBooks()!!!!!");
	}
}
