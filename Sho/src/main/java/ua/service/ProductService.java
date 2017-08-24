package ua.service;

import java.util.List;


import ua.entity.Product;

public interface ProductService {

	public void save(Product product);
	
	public Product findOne(int id);
	
	public List<Product> findAll();
	
	public void remove(int id);
	

}