package ua.domain;

import java.math.BigDecimal;

import ua.entity.Season;

public class ProductIndex {
	
	private Integer id;
	
	private String photoUrl;
	
	private Integer version;
	
	private BigDecimal price;
	
	private Season season;
	
	private String category;
	
	private String subCategory;
	
	private String subSubCategory;





	

	public ProductIndex(Integer id, String photoUrl, Integer version, BigDecimal price, Season season, String category,
			String subCategory, String subSubCategory) {
		super();
		this.id = id;
		this.photoUrl = photoUrl;
		this.version = version;
		this.price = price;
		this.season = season;
		this.category = category;
		this.subCategory = subCategory;
		this.subSubCategory = subSubCategory;
	}

	public ProductIndex() {
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}



	public String getSubCategory() {
		return subCategory;
	}

	public void setSubCategory(String subCategory) {
		this.subCategory = subCategory;
	}

	public String getSubSubCategory() {
		return subSubCategory;
	}

	public void setSubSubCategory(String subSubCategory) {
		this.subSubCategory = subSubCategory;
	}

	public void setCategory(String category) {
		this.category = category;
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

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	

	public String getCategory() {
		return category;
	}

	public Season getSeason() {
		return season;
	}

	public void setSeason(Season season) {
		this.season = season;
	}


	
	
	
	

}
