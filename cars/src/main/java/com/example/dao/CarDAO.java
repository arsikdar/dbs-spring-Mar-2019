package com.example.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.model.Car;
import com.example.util.CarRowMapper;

@Repository
public class CarDAO {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public Car selectCarByVIN(int vin) {
		Object[] parms= {vin};
		return jdbcTemplate.queryForObject("select * from car_detail where vin=?",parms,new CarRowMapper());
	}
	

	public List<Car> selectAll() {
		return jdbcTemplate.query("select * from car_detail",new CarRowMapper());
	}
	
	public void save(Car car) {
		Object[] parms= {car.getVin(),car.getModel(),car.getMake(),car.getPrice()};
		jdbcTemplate.update("insert into car_detail values(?,?,?,?)",parms);
	}

}
