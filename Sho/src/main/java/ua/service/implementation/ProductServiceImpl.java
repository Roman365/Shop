package ua.service.implementation;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import ua.entity.Product;
import ua.repository.ProductRepository;
import ua.service.ProductService;


@Service
public class ProductServiceImpl  implements ProductService{
	@Autowired
	private ProductRepository productRepository;
	
	@Override
	public List<Product> findAll() {
		return productRepository.findAll();
	}

	@Override
	public void save(Product product) {
		productRepository.save(product);
		
	}
	@Override
	public Product findOne(int id) {
		return productRepository.findOne(id);
	}

	@Override
	public void remove(int id) {
		productRepository.delete(id);
	}
}