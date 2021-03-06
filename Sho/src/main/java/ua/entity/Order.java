package ua.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="order_table")

public class Order {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	private double  sum;
	
	private double discount;
	
	private Date date;
	
	private String city;
	
	private String address;
	
	private String typeDelivery;
	
	private String typePay;
	
	@OneToMany(mappedBy = "order")
	private List<ProductInOrder> productInOrders;

	@ManyToOne
	private UserEntity userEntity;

	

	public Order(Integer id, double sum, double discount, Date date, String city, String address, String typeDelivery,
			String typePay, List<ProductInOrder> productInOrders, UserEntity userEntity) {
		super();
		this.id = id;
		this.sum = sum;
		this.discount = discount;
		this.date = date;
		this.city = city;
		this.address = address;
		this.typeDelivery = typeDelivery;
		this.typePay = typePay;
		this.productInOrders = productInOrders;
		this.userEntity = userEntity;
	}

	public Order() {
		
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public double getSum() {
		return sum;
	}

	public void setSum(double sum) {
		this.sum = sum;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTypeDelivery() {
		return typeDelivery;
	}

	public void setTypeDelivery(String typeDelivery) {
		this.typeDelivery = typeDelivery;
	}

	public String getTypePay() {
		return typePay;
	}

	public void setTypePay(String typePay) {
		this.typePay = typePay;
	}

	public List<ProductInOrder> getProductInOrders() {
		return productInOrders;
	}

	public void setProductInOrders(List<ProductInOrder> productInOrders) {
		this.productInOrders = productInOrders;
	}

	public UserEntity getUserEntity() {
		return userEntity;
	}

	public void setUserEntity(UserEntity userEntity) {
		this.userEntity = userEntity;
	}


 


}
