package com.incident.mgmt.entity;

import lombok.Data;

@Data
public class Login {
	
	private String email;
	private String mobile;
	private String password;
	
	@Override
	public String toString() {
		return "Login [email=" + email + ", mobile=" + mobile + ", password=" + password + "]";
	}
	
	
	
}
