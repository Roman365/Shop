package ua.entity;

import static javax.persistence.FetchType.LAZY;
import static javax.persistence.GenerationType.IDENTITY;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class UserEntity  {
	@Id
	@GeneratedValue(strategy=IDENTITY)
	private int id;
	
	private String firstname;
	
	private String lastname;
	
	private String email;
	
	private String password;
	
	private Integer phone;
	
	private Role role;
	
	@OneToMany(fetch = LAZY, mappedBy = "userEntity")
	private List<Order> order = new ArrayList<>();
	
	public UserEntity() {}
	
	
	public Role getRole() {
		return role;
	}


	public void setRole(Role role) {
		this.role = role;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setName(String name) {
		
	}


	@Override
	public String toString() {
		return "UserEntity [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", email=" + email
				+ ", password=" + password + ", phone=" + phone + ", role=" + role + "]";
	}


	
	
	
	
	

}
