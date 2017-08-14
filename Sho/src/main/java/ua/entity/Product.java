package ua.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import static javax.persistence.FetchType.LAZY;
import static javax.persistence.GenerationType.*;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="product")

public class Product {
	
	@Id
	@GeneratedValue(strategy=IDENTITY)
	private Integer id;
	
	private String name;
	
	private BigDecimal price;
	
	private Season season;
	
	@OneToMany(mappedBy="product")
	private List<Photo> photos = new ArrayList<>();
	
	private Size size;
	
	private String description;
	
	@ManyToOne(fetch=LAZY)
	private Category category;
	
	@ManyToOne(fetch=LAZY)
	private SubCategory subCategory;
	
	@ManyToOne(fetch=LAZY)
	private SubSubCategory subSubCategory;

	

	public Product() {

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

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Season getSeason() {
		return season;
	}

	public void setSeason(Season season) {
		this.season = season;
	}

	public List<Photo> getPhotos() {
		return photos;
	}

	public void setPhotos(List<Photo> photos) {
		this.photos = photos;
	}

	public Size getSize() {
		return size;
	}

	public void setSize(Size size) {
		this.size = size;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public SubCategory getSubCategory() {
		return subCategory;
	}

	public void setSubCategory(SubCategory subCategory) {
		this.subCategory = subCategory;
	}

	public SubSubCategory getSubSubCategory() {
		return subSubCategory;
	}

	public void setSubSubCategory(SubSubCategory subSubCategory) {
		this.subSubCategory = subSubCategory;
	}

	

	

}
