package com.capg.spring3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capg.spring3.entities.Product;
import com.capg.spring3.service.ProductService;
@RestController
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@PostMapping(value="/products", consumes= {"application/json"}, produces= {"application/json"})
	public Product addProduct(@RequestBody Product product)
	{
		return productService.addProduct(product);
	}
	@GetMapping(value="/products/{id}",produces= {"application/json"})
	
	//@ResponseStatus(HttpStatus.NOT_FOUND)
	public Product getProduct(@PathVariable("id") int id) 
	{
		Product product=productService.getProduct(id);
		
		
		return product;
	}
	@GetMapping(value="/products",produces={"application/json"})
	public List<Product> getAllProducts()
	{
		return productService.getAllProduct();
	}
		
}