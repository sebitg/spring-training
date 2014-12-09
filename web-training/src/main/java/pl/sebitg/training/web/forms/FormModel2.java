package pl.sebitg.training.web.forms;

import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotEmpty;

public class FormModel2 {
	
	@NotEmpty
	private String address;
	
	@NotEmpty
	@Pattern(regexp="[0-9]{2}-[0-9]{3}")
	private String postal;
	
	@NotEmpty
	@Pattern(regexp="[A-Za-z0-9-.]+@[A-Za-z0-9-.]+")
	private String email;
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getPostal() {
		return postal;
	}
	
	public void setPostal(String postal) {
		this.postal = postal;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}