package com.example.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.example.entity.Car;
import com.example.entity.Vehicle;
import com.example.service.CarService;
import com.example.service.VehicleService;

@RestController
public class MyController {
	@Autowired
	private VehicleService vservice;
	
	@Autowired
	private CarService cservice;
	
	@GetMapping(value="/vehicle")
	public ResponseEntity<List<Vehicle>> findAllUser() {
	return new ResponseEntity<List<Vehicle>>(vservice.getVehicle(), HttpStatus.OK);
		
	}
		
	@PostMapping(value="/vehicle")
	public ResponseEntity<String> addProdct(@RequestBody Vehicle vehicle) {
	vservice.saveVehicle(vehicle);
	return new ResponseEntity<String>("record saved successfully",HttpStatus.OK);
	}
	
	@GetMapping(value="/car")
	public ResponseEntity<List<Car>> findAllOrder() {
	return new ResponseEntity<List<Car>>(cservice.getOrder(), HttpStatus.OK);
		
	}
		
	@PostMapping(value="/car")
	public ResponseEntity<String> addProdct(@RequestBody Car car) {
	cservice.saveCar(car);
	return new ResponseEntity<String>("record saved successfully",HttpStatus.OK);
	}
	
	

}
