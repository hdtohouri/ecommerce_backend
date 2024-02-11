package com.ecommerce_backend.metier;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ecommerce_backend.entities.Utilisateurs;

@Service
public interface UtilisateursService {

	List<Utilisateurs> getAllUsers();
	
	Utilisateurs saveUsers(Utilisateurs utilisateurs);

	public String deleteUser(long id);

	Utilisateurs findUser(String username, String user_password);
}
