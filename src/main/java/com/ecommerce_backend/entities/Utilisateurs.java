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
	private String user_firstname;
	
	@Column(name = "user_lastname")
	private String user_lastname;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}


	public String getUser_password() {
		return user_password;
	}

	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}

	public String getUser_firstname() {
		return user_firstname;
	}

	public void setUser_firstname(String user_firstname) {
		this.user_firstname = user_firstname;
	}

	public String getUser_lastname() {
		return user_lastname;
	}

	public void setUser_lastname(String user_lastname) {
		this.user_lastname = user_lastname;
	}

	public Utilisateurs(String username, String user_password, String user_firstname, String user_lastname) {
		super();
		this.username = username;
		this.user_password = user_password;
		this.user_firstname = user_firstname;
		this.user_lastname = user_lastname;
	}

	public Utilisateurs() {
		super();
	}

	
	
	

}
