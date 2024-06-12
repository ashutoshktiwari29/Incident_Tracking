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

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@Entity
@Table(name="ticket")
@JsonIgnoreProperties(ignoreUnknown=true)
public class Ticket {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long ticketId;
	private Long resolverUserId;
	@Column(name = "createrUserId", nullable = false)
	private Long createrUserId;
	@Column(name = "merchantId", nullable = false)
	private Long merchantId;
	@Column(name = "description", nullable = false)
	private String description;
	@Column(name = "title", nullable = false)
	private String title;
	@Column(name = "status", nullable = false)
	private String status;
	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	private Date createDate;
	@UpdateTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	private Date lastDate;


}
