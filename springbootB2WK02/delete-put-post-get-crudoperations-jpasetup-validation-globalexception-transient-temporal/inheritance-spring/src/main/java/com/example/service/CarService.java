package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.entity.Car;
import com.example.repository.CarRepository;

@Service
public class CarService {
	@Autowired
	private CarRepository crepo;

	public void saveCar(Car car) {
		crepo.save(car);
	}

	public List<Car> getOrder() {
		
		return crepo.findAll();
	}

}



