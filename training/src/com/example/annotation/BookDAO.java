package com.example.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class BookDAO {
	
	//Dependency Injection
	@Autowired
	@Qualifier("bookID")
	int id;
	
	
	//Dependency Injection
	@Autowired
	@Qualifier("currentTime")
	String time;

	public void save() {
		System.out.println("Inside BookDAO.save()!!!!");
		System.out.printf("Book Saved : %s in DB and current time is : %s%n",this.id,this.time);
	}

	public void selectAll() {
		System.out.println("Inside BookDAO.selectAll()!!!!");
	}

}
