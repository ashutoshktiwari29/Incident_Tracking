package com.incident.mgmt.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown=true)
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
