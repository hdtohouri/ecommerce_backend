package com.ecommerce_backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@PostMapping(value = "/add/product")	
	public Products productresgister(@RequestBody Products products)
	{
		return productService.saveProduct(products);
	}
	
	@DeleteMapping(value = "/product/{id}")
	public String deleteUser(@PathVariable("id") long id)
	{
		productService.deleteProduct(id);
		return "Produit supprimé avec succes";
	}
	
}
