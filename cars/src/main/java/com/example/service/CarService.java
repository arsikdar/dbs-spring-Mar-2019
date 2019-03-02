package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.CarDAO;
import com.example.model.Car;

@Service
public class CarService {

	@Autowired
	CarDAO carDAO;

	public Car readCarByVIN(int vin) {
		return carDAO.selectCarByVIN(vin);
	}

	public List<Car> readAllCars() {
		return carDAO.selectAll();
	}

	public void addCar(Car car) {
		carDAO.save(car);
	}
}
