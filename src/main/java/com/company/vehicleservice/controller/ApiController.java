package com.company.vehicleservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiController {

	@GetMapping("/admin/dashboard")
	public String adminDashboard() {
		return "Admin Dashboard";
	}

	@GetMapping("/user/profile")
	public String userProfile() {
		return "User Profile";
	}

	@GetMapping("/manager/summary")
	public String managerSummary() {
		return "Manager Summary";
	}

	@GetMapping("/public/info")
	public String publicInfo() {
		return "Public Information";
	}

	@GetMapping("/common/data")
	public String commonData() {
		return "Common Data for All";
	}

	@GetMapping("/admin/settings")
	public String adminSettings() {
		return "Admin Settings";
	}

	@GetMapping("/admin/a1")
	public String adminA1() {
		return "Admin API A1";
	}

	@GetMapping("/admin/a2")
	public String adminA2() {
		return "Admin API A2";
	}

	@GetMapping("/admin/a3")
	public String adminA3() {
		return "Admin API A3";
	}

	@GetMapping("/user/u1")
	public String userU1() {
		return "User API U1";
	}

	@GetMapping("/user/u2")
	public String userU2() {
		return "User API U2";
	}
}
