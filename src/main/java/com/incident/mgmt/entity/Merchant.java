package com.incident.mgmt.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="merchant_table")
public class Merchant {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long mechantId;
	@Column
	private String m_name;
	@Column
	private String email;
	public Merchant(Long mechantId, String m_name, String email) {
		super();
		this.mechantId = mechantId;
		this.m_name = m_name;
		this.email = email;
	}
	public Long getMechantId() {
		return mechantId;
	}
	public void setMechantId(Long mechantId) {
		this.mechantId = mechantId;
	}
	public String getM_name() {
		return m_name;
	}
	public void setM_name(String m_name) {
		this.m_name = m_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
