package com.ecommerce_backend.metier;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ecommerce_backend.entities.Products;

@Service
public interface ProductService {

	List<Products> getAllProducts();
	Products saveProduct(Products products);
	public String deleteProduct(long id);
}
