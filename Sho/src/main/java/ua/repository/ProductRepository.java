package ua.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import ua.entity.Product;


public interface ProductRepository extends JpaRepository<Product, Integer>{

	

	
}
