package pl.sebitg.training.web.forms;

import org.hibernate.validator.constraints.NotEmpty;

public class FormModel {
	
	@NotEmpty
	private String name;
	
	@NotEmpty
	private String lastName;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}