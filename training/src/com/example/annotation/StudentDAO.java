package com.example.annotation;

import org.springframework.stereotype.Repository;

@Repository
public class StudentDAO {

	public void save() {
		System.out.println("Inside StudentDAO.save()!!!!");
	}

	public void selectAll() {
		System.out.println("Inside StudentDAO.selectAll()!!!!");
	}

}
