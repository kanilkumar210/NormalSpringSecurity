package com.company.vehicleservice.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
public class Vehicle {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@NotBlank(message = "Name is required")
	@Size(min = 4, max = 20)
	private String name;
	@NotBlank(message = "vehicle number is required")
	private String vehicleNo;
	@NotBlank(message = "Email is required")
	@Email(message = "Invalid email format")
	@Column(unique = true)
	private String email;

	public int getId() {
		return id;
	}

	public Vehicle(int id, String name, String vehicleNo, String email) {
		super();
		this.id = id;
		this.name = name;
		this.vehicleNo = vehicleNo;
		this.email = email;
	}

	public Vehicle(String name, String vehicleNo, String email) {
		super();
		this.name = name;
		this.vehicleNo = vehicleNo;
		this.email = email;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getvehicleNo() {
		return vehicleNo;
	}

	public void setvehicleNo(String vehicleNo) {
		this.vehicleNo = vehicleNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Vehicle() {
		super();
	}

}
