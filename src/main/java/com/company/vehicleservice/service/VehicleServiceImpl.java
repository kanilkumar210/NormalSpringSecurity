package com.company.vehicleservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.vehicleservice.exception.EmailAlreadyPresentException;
import com.company.vehicleservice.exception.InvalidVehicleId;
import com.company.vehicleservice.model.Vehicle;
import com.company.vehicleservice.repo.VehicleRepository;

@Service
public class VehicleServiceImpl {

	@Autowired
	private VehicleRepository vehicleRepo;

	public Vehicle createVehicle(Vehicle vehicle) {

		if (vehicleRepo.findByEmail(vehicle.getEmail()) != null) {
			throw new EmailAlreadyPresentException("Email Already Exist: " + vehicle.getEmail());
		}
		return vehicleRepo.save(vehicle);
	}

	public Vehicle getVehicleById(int id) {
		return vehicleRepo.findById(id).orElseThrow(() -> new InvalidVehicleId("Vehicle Not Found With Id: " + id));
	}

}
