package com.example.di;

public class BookService {

	BookDAO bookDAO;

	public void setBookDAO(BookDAO bookDAO) {
		this.bookDAO = bookDAO;
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
