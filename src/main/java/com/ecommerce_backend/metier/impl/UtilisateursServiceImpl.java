package com.ecommerce_backend.metier.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ecommerce_backend.dao.UtilisateursRepository;
import com.ecommerce_backend.entities.Utilisateurs;
import com.ecommerce_backend.metier.UtilisateursService;

@Service
public class UtilisateursServiceImpl implements UtilisateursService{

	private UtilisateursRepository users;
	
	public UtilisateursServiceImpl(UtilisateursRepository users) {
		super();
		this.users = users;
	}
	
	
	@Override
	public List<Utilisateurs> getAllUsers() {
		return users.findAll();
	}
	@Override
	public Utilisateurs saveUsers(Utilisateurs utilisateurs) {
		return users.save(utilisateurs);
	}


	@Override
	public String deleteUser(long id) {
		// TODO Auto-generated method stub
		users.deleteById(id);
		return "Utilisateur supprimé avec succes";
	}


	@Override
	public Utilisateurs findUser(String username, String user_password) {
		List<Utilisateurs> allUsers = users.findAll();
	    
	    for (Utilisateurs utilisateurs : allUsers) {
	        if (utilisateurs.getUsername().equals(username) && utilisateurs.getUser_password().equals(user_password)) {
	            return utilisateurs;
	        }
	    }
	    
	    return null; 
	}


	
	

	
}
