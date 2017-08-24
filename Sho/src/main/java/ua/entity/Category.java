package ua.entity;

import javax.persistence.GenerationType;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name="category")
public class Category {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	
	private String name;
	
	@OneToMany(mappedBy="category")
	private List<Product> product = new ArrayList<>();
	


	public Category(Integer id, String name, List<Product> product) {
		super();
		this.id = id;
		this.name = name;
		this.product = product;
	}
	
	

	public Category() {
	
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