package ua.domain.request;

import org.springframework.web.multipart.MultipartFile;

import ua.entity.Category;
import ua.entity.SubCategory;
import ua.entity.SubSubCategory;

public class ProductRequest {

	private Integer id;
	
	private MultipartFile file;
	
	private String price;
	
	private Category category;
	
	private SubSubCategory subSubCategory;
	
	private SubCategory subCategory;
	


	private String description;
	


	public ProductRequest(Integer id, MultipartFile file, String price, Category category,
			SubSubCategory subSubCategory, SubCategory subCategory, String description) {
		super();
		this.id = id;
		this.file = file;
		this.price = price;
		this.category = category;
		this.subSubCategory = subSubCategory;
		this.subCategory = subCategory;
		this.description = description;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public MultipartFile getFile() {
		return file;
	}

	public void setFile(MultipartFile file) {
		this.file = file;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}



	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public SubSubCategory getSubSubCategory() {
		return subSubCategory;
	}

	public void setSubSubCategory(SubSubCategory subSubCategory) {
		this.subSubCategory = subSubCategory;
	}

	public SubCategory getSubCategory() {
		return subCategory;
	}

	public void setSubCategory(SubCategory subCategory) {
		this.subCategory = subCategory;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}