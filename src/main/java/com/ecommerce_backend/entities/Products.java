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

	/**
	 * @return the product_name
	 */
	public String getProduct_name() {
		return product_name;
	}

	/**
	 * @param product_name the product_name to set
	 */
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	/**
	 * @return the product_description
	 */
	public String getProduct_description() {
		return product_description;
	}

	/**
	 * @param product_description the product_description to set
	 */
	public void setProduct_description(String product_description) {
		this.product_description = product_description;
	}

	/**
	 * @return the product_image
	 */
	public String getProduct_image() {
		return product_image;
	}

	/**
	 * @param product_image the product_image to set
	 */
	public void setProduct_image(String product_image) {
		this.product_image = product_image;
	}

	/**
	 * @return the product_price
	 */
	public Double getProduct_price() {
		return product_price;
	}

	/**
	 * @param product_price the product_price to set
	 */
	public void setProduct_price(Double product_price) {
		this.product_price = product_price;
	}

	public Products(String product_name, String product_description, String product_image, Double product_price) {
		super();
		this.product_name = product_name;
		this.product_description = product_description;
		this.product_image = product_image;
		this.product_price = product_price;
	}

	public Products() {
		super();
	}

	
	
	
	
}
