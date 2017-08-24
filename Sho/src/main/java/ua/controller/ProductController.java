package ua.controller;



import java.util.List;

import org.hibernate.loader.custom.Return;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import ua.entity.Product;
import ua.service.CategoryService;
import ua.service.ProductService;
//import ua.domain.request.ApartmentRequest;
import ua.service.SubCategoryService;
import ua.service.SubSubCategoryService;


@Controller
@RequestMapping("/product")
@SessionAttributes("product")
public class ProductController {

	@Autowired
	private ProductService productService;
	
	private CategoryService categoryService;
	
	private SubCategoryService subCategoryService;
	
	private SubSubCategoryService subSubCategoryService;
	
	@PutMapping
	public Product save(@RequestBody Product product) {
		productService.save(product);
		return product;
	}
	
	@GetMapping
	public List<Product> get() {
		return productService.findAll();
	}
	
	


}