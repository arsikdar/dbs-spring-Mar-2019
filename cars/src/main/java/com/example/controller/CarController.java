package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Car;
import com.example.service.CarService;

@RestController
@RequestMapping("/api")
public class CarController {

	@Autowired
	CarService carService;

	// Read All Cars
	@GetMapping(path = "/cars", produces = { "application/json", "application/xml" })
	public List<Car> getAllCars() {
		System.out.println("Inside CarController.getAllCars()!!!!");
		return carService.readAllCars();
	}

	// Read Car By VIN
	@GetMapping(path = "/car", produces = { "application/json", "application/xml" })
	public Car getCarByVIN() {
		System.out.println("Inside CarController.getCarByVIN()!!!!");
		return new Car(1, "A5", "Audi", 40000.00);
	}

	// Read Car By VIN
	@GetMapping(path = "/car/{vin}", produces = { "application/json", "application/xml" })
	public Car getCarByVINDB(@PathVariable("vin") int arg) {
		System.out.println("Inside CarController.getCarByVINDB()!!!!");
		return carService.readCarByVIN(arg);
	}

	// Add new Car
	@PostMapping(path = "/car", produces = { "text/plain" })
	public String addNewCar() {
		System.out.println("Inside CarController.addNewCar()!!!!");
		carService.addCar(new Car());
		return "Car added successfully!!!";
	}

	// Update existing Car

	// Delete a Car

}
