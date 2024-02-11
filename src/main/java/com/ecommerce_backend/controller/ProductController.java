package com.ecommerce_backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce_backend.entities.Products;
import com.ecommerce_backend.metier.ProductService;


@RestController
@CrossOrigin(origins = "*")
public class ProductController {
	
	@Autowired
	private ProductService productService;

	public ProductController(ProductService productService) {
		super();
		this.productService = productService;
	}
	
	@GetMapping(value = "/products")	
	public List<Products> getproducts()
	{
		return productService.getAllProducts();
		
	}
	
}
