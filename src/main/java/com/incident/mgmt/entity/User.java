package com.incident.mgmt.entity;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import lombok.Data;

@Entity
@Data
@Table(name="user")
public class User {
	@Id    
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String type;
	@Column(name = "email", unique=true)
	private String email;
	@Column(name = "mobile", unique=true)
	private String mobile;
	private String password;
	//private String addressId;
	//@Column(name = "lastUpdate", nullable = false, updatable = true)
    @UpdateTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	private Date lastUpdate;

	//@Column(name = "regDate", nullable = false, updatable = false)
	//@Temporal(TemporalType.TIMESTAMP
    @CreationTimestamp
	private Date regDate;



}
