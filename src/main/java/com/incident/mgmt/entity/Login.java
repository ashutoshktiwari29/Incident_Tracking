package com.incident.mgmt.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown=true)
public class Login {
	
	private String email;
	private String mobile;
	private String password;
	
	@Override
	public String toString() {
		return "Login [email=" + email + ", mobile=" + mobile + ", password=" + password + "]";
	}
	
	
	
}
