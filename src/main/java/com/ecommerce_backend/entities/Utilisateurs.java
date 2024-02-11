package com.ecommerce_backend.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Users")
public class Utilisateurs {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "username")
	private String username;
	
	@Column(name = "user_password")
	private String user_password;
	
	@Column(name = "user_firstname")
	private String nom;
	
	@Column(name = "user_lastname")
	private String prenom;

}
