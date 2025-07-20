package com.company.vehicleservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.company.vehicleservice.model.Vehicle;
import com.company.vehicleservice.service.VehicleServiceImpl;

import jakarta.validation.Valid;


@RestController
@RequestMapping("/vehicle/api/")
public class VehicleController {

	@Autowired
	private VehicleServiceImpl vehicleService;

	@PostMapping("/public/createVehicle")
	public Vehicle createVehicle(@RequestBody @Valid Vehicle vehicle) {

		return vehicleService.createVehicle(vehicle);
	}
	
	@GetMapping("/private/getVehicleById/{id}")
	public Vehicle getVehicleById(@PathVariable int id) {
		return vehicleService.getVehicleById(id);
	}
	

}
