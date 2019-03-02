package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.CarDAO;

@Service
public class CarService {

	@Autowired
	CarDAO carDAO;

	public String readCarByID() {
		System.out.println("Inside CarService.readCarByID()!!!!");
		// 10 business logic
		return carDAO.selectCarByID();
	}

}
