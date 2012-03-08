package com.dreamworks.portal.bean;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


public class User {
	@NotNull
	@Size(min = 1, max = 25)
	private String name;
	@NotNull
	@Size(min = 1, max = 25)
	private String password;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
