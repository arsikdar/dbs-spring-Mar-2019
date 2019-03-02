CREATE TABLE car_detail(
	vin INT NOT NULL,
	model VARCHAR(30) NOT NULL,
	make VARCHAR(30),
	price DOUBLE(10,4),
	PRIMARY KEY (vin));