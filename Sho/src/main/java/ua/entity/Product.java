package ua.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String photoUrl;

	private Integer version;

	private BigDecimal price;
	
	private String description;
	
	private String size;
	
	
	
	

	@OneToMany(mappedBy = "product")
	private List<ProductInOrder> productInOrder;

	@OneToMany(mappedBy = "product")
	private List<Photo> photos = new ArrayList<>();
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Category category;

	@ManyToOne(fetch = FetchType.LAZY)
	private SubCategory subCategory;

	@ManyToOne(fetch = FetchType.LAZY)
	private SubSubCategory subSubCategory;





	



	public Product(Integer id, String photoUrl, Integer version, BigDecimal price, String description, String size,
			 List<ProductInOrder> productInOrder, List<Photo> photos, Category category,
			SubCategory subCategory, SubSubCategory subSubCategory) {
		super();
		this.id = id;
		this.photoUrl = photoUrl;
		this.version = version;
		this.price = price;
		this.description = description;
		this.size = size;
		this.productInOrder = productInOrder;
		this.photos = photos;
		this.category = category;
		this.subCategory = subCategory;
		this.subSubCategory = subSubCategory;
	}



	public Product() {
		
	}



	public String getSize() {
		return size;
	}



	public void setSize(String size) {
		this.size = size;
	}



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPhotoUrl() {
		return photoUrl;
	}

	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}


	public List<Photo> getPhotos() {
		return photos;
	}

	public void setPhotos(List<Photo> photos) {
		this.photos = photos;
	}



	public List<ProductInOrder> getProductInOrder() {
		return productInOrder;
	}



	public void setProductInOrder(List<ProductInOrder> productInOrder) {
		this.productInOrder = productInOrder;
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



	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
