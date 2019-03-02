package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.service.CarService;

@Controller
public class CarController {
	
	@Autowired
	CarService carService;
		
	@RequestMapping(path="cardetails")
	public ModelAndView handleRequest() {
		System.out.println("Inside CarController.handleRequest()!!!!");
		return new ModelAndView("carDetails", "CAR-INFO", "VIN-100,MAKE-AUDI Q7,PRICE-4500000.00");
	}

	@RequestMapping(path="carbyid")
	public ModelAndView getCarDetails() {
		System.out.println("Inside CarController.getCarDetails()!!!!");
		return new ModelAndView("carDetails", "CAR-INFO", carService.readCarByID());
	}

}
