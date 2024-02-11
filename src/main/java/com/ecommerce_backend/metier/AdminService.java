package com.ecommerce_backend.metier;

import org.springframework.stereotype.Service;

import com.ecommerce_backend.entities.Admin;

@Service
public interface AdminService {

	Admin findAdmin(String admin_username, String admin_password);
	

}
