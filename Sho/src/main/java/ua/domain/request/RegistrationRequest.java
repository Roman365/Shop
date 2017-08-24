package ua.domain.request;

import javax.validation.constraints.AssertTrue;

public class RegistrationRequest {

	private String email;				//ДАНІ З UserEntity
	
	private String password;
	
	private String passwordRepeat;		//ДЛЯ РЕЄСТРАЦІЇ, ПІДТВЕРДЖЕННЯ ПАРОЛЮ
	
	private String name;
	
	private boolean isOwner;

	@AssertTrue(message = "not equal")
	public boolean getCheckPass(){
		if(password==null){return false;}
		return password.equals(passwordRepeat);
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

	public String getPasswordRepeat() {
		return passwordRepeat;
	}

	public void setPasswordRepeat(String passwordRepeat) {
		this.passwordRepeat = passwordRepeat;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isOwner() {
		return isOwner;
	}

	public void setOwner(boolean isOwner) {
		this.isOwner = isOwner;
	}

	@Override
	public String toString() {
		return "RegistrationRequest [email=" + email + ", password=" + password + ", passwordRepeat=" + passwordRepeat
				+ ", name=" + name + ", isOwner=" + isOwner + "]";
	}
	
	
}
