package com.ecommerce_backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce_backend.entities.Admin;
import com.ecommerce_backend.metier.AdminService;

@RestController
@CrossOrigin(origins = "*")
public class AdminController {
	
	@Autowired
	private AdminService adminService;
	
	
	
	public AdminController(AdminService adminService) {
		super();
		this.adminService = adminService;
	}



	@PostMapping("/admin/login")
	public Admin Login(@RequestBody Admin admin) {
		Admin user = adminService.findAdmin(admin.getAdmin_username(), admin.getAdmin_password());
		return user;
	}

}
