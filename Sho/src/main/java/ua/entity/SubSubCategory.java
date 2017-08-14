package ua.entity;

import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.*;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Id;
import javax.persistence.OneToMany;

public class SubSubCategory {
	
	@Id
	@GeneratedValue(strategy=IDENTITY)
	private Integer id;
	
	private String name;
	
	@OneToMany(mappedBy="subSubCategory")
	private List<Product> product = new ArrayList<>();

	public SubSubCategory() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Product> getProduct() {
		return product;
	}

	public void setProduct(List<Product> product) {
		this.product = product;
	}


	
	
	

}
