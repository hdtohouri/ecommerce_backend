package com.ecommerce_backend.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="product")
public class Products {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "product_name")
	private String product_name;
	
	@Column(name = "product_description")
	private String product_description;
	
	@Column(name = "product_image")
	private String product_image;
	
	@Column(name = "product_price")
	private Double product_price;
}
