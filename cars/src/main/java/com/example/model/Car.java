package com.example.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "car")
public class Car {

	int vin;
	String model;
	String make;
	double price;

	public Car() {
	}

	public Car(String model, String make, double price) {
		this.model = model;
		this.make = make;
		this.price = price;
	}

	public Car(int vin, String model, String make, double price) {
		this.vin = vin;
		this.model = model;
		this.make = make;
		this.price = price;
	}

	@XmlAttribute(name = "vin")
	public int getVin() {
		return vin;
	}

	public void setVin(int vin) {
		this.vin = vin;
	}

	@XmlElement(name = "name")
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@XmlElement(name = "company")
	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	@XmlElement(name = "price")
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car [vin=" + vin + ", model=" + model + ", make=" + make + ", price=" + price + "]";
	}

}
