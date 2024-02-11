package com.ecommerce_backend.metier.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ecommerce_backend.dao.ProductRepository;
import com.ecommerce_backend.entities.Products;
import com.ecommerce_backend.metier.ProductService;

@Service
public class ProductServiceImpl implements ProductService  {

	private ProductRepository productRepository;

	public ProductServiceImpl(ProductRepository productRepository) {
		super();
		this.productRepository = productRepository;
	}

	@Override
	public List<Products> getAllProducts() {
		// TODO Auto-generated method stub
		return productRepository.findAll();
	}

	@Override
	public Products saveProduct(Products products) {
		// TODO Auto-generated method stub
		return productRepository.save(products);
	}

	@Override
	public String deleteProduct(long id) {
		productRepository.deleteById(id);
		return "Produit supprimé avec succes";
	}
	
	
}
