package com.ecommerce_backend.metier.impl;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ecommerce_backend.dao.AdminRepository;
import com.ecommerce_backend.entities.Admin;
import com.ecommerce_backend.metier.AdminService;

@Service
public class AdminServiceImpl implements AdminService {
	
	private AdminRepository admin;
	

	public AdminServiceImpl(AdminRepository admin) {
		super();
		this.admin = admin;
	}


	@Override
	public Admin findAdmin(String admin_username, String admin_password) {
		List<Admin> allUsers = admin.findAll();
	    
	    for (Admin admin : allUsers) {
	        if (admin.getAdmin_username().equals(admin_username) && admin.getAdmin_password().equals(admin_password)) {
	            return admin;
	        }
	    }
	    
	    return null; 
	}

}
