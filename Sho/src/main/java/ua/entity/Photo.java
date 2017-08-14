package ua.entity;

import javax.persistence.Entity;
import static javax.persistence.FetchType.*;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.*;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="photo_entity")
public class Photo {
	
	@Id
	@GeneratedValue(strategy=IDENTITY)
	private Integer id;
	
	private String photoUrl;
	
	@ManyToOne(fetch=LAZY)
	private Product product;
	
	

	public Photo() {
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

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	
	

}
