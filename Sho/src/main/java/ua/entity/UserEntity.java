package ua.entity;

import static javax.persistence.FetchType.LAZY;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.*;
import javax.persistence.Id;
import javax.persistence.OneToMany;

public class UserEntity  {

	@Id
	@GeneratedValue(strategy=IDENTITY)
	private Integer id;
	
    private String firstname;
	
	private String lastname;
	
	private String email;
	
	private String password;
	
	private Integer phone;
	
	@OneToMany(fetch = LAZY, mappedBy = "userEntity")
	private List<Order> order = new ArrayList<>();
	
	private Role role;

	
	public UserEntity() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}


	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
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

	public Integer getPhone() {
		return phone;
	}

	public void setPhone(Integer phone) {
		this.phone = phone;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "UserEntity [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", email=" + email
				+ ", password=" + password + ", phone=" + phone + ", order=" + order + ", role=" + role + "]";
	}


}
