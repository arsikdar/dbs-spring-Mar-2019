package com.example.dao;

import org.springframework.stereotype.Repository;

@Repository
public class CarDAO {

	public String selectCarByID() {
		System.out.println("Inside CarDAO.selectCarByID()!!!!");
		//10 DB logic
		return "VIN-100,MAKE-AUDI Q7,PRICE-4500000.00";
	}

}
