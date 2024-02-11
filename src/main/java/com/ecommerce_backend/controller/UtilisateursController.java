package com.ecommerce_backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce_backend.entities.Utilisateurs;
import com.ecommerce_backend.metier.UtilisateursService;






@RestController
@CrossOrigin(origins = "*")
public class UtilisateursController {

	@Autowired
	private UtilisateursService utilisateursService;

	public UtilisateursController(UtilisateursService utilisateursService) {
		super();
		this.utilisateursService = utilisateursService;
	}
	
	@GetMapping(value = "/users")	
	public List<Utilisateurs> getusers()
	{
		return utilisateursService.getAllUsers();
		
	}
	
	@PostMapping(value = "/register")	
	public Utilisateurs userresgister(@RequestBody Utilisateurs utilisateurs)
	{
		return utilisateursService.saveUsers(utilisateurs);
	}
	
	@DeleteMapping(value = "/user/{id}")
	public String deleteUser(@PathVariable("id") long id)
	{
		utilisateursService.deleteUser(id);
		return "Utilisateur supprimé avec succes";
	}
	
	@PostMapping("/login")
	public Utilisateurs Login(@RequestBody Utilisateurs utilisateurs) {
		Utilisateurs oldUtilisateurs = utilisateursService.findUser(utilisateurs.getUsername(), utilisateurs.getUser_password());
		return oldUtilisateurs;
	}
}
