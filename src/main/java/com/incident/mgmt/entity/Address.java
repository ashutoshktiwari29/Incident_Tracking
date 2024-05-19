package com.incident.mgmt.entity;

import lombok.Data;

@Data
public class Address {
	
	private Long id;
	private String houseNo;
	private String distic;
	private String state;
	private String locality;
	private String pin;
	private String country;
	private String createDate;
	private String lastupdate;
	

}
