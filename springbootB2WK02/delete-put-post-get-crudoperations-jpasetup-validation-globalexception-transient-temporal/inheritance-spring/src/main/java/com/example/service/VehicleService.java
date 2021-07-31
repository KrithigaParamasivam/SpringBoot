package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.entity.Vehicle;


import com.example.repository.VehicleRepository;

@Service
public class VehicleService {
	
	@Autowired
	private VehicleRepository vrepo;

	public List<Vehicle> getVehicle() {
		return vrepo.findAll();
	}

	public void saveVehicle(Vehicle vehicle) {
		vrepo.save(vehicle);
		
	}
}
