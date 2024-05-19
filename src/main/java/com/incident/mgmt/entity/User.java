package com.incident.mgmt.entity;

import java.sql.Date;

public class User {
	
	private int id;
	private String type;
	private String email;
	private String mobile;
	private String password;
	private String addressId;
	private Date LastUpdate;
	private Date RegDate;
	
	
	public Date getLastUpdate() {
		return LastUpdate;
	}
	public void setLastUpdate(Date lastUpdate) {
		LastUpdate = lastUpdate;
	}
	public Date getRegDate() {
		return RegDate;
	}
	public void setRegDate(Date regDate) {
		RegDate = regDate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddressId() {
		return addressId;
	}
	public void setAddressId(String addressId) {
		this.addressId = addressId;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", type=" + type + ", email=" + email + ", mobile=" + mobile + ", password="
				+ password + ", addressId=" + addressId + ", LastUpdate=" + LastUpdate + ", RegDate=" + RegDate + "]";
	}
	
	
	
	

}
