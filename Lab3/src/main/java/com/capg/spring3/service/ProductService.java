package com.capg.spring3.service;

import java.util.List;

import com.capg.spring3.entities.Product;

public interface ProductService {
	public Product addProduct(Product product);
	public Product getProduct(int id);
	public List<Product> getAllProduct();

}