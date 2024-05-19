package com.incident.mgmt.entity;

import java.sql.Date;

public class MerchantDetails {
	
	private int mechantId;

	private String m_name;

	private String email;
	
	private String phone;

	private String addressId;
	
	private Date regDAta;

	private Date LastUpdate;

	@Override
	public String toString() {
		return "MerchantDetails [mechantId=" + mechantId + ", m_name=" + m_name + ", email=" + email + ", phone="
				+ phone + ", addressId=" + addressId + ", regDAta=" + regDAta + ", LastUpdate=" + LastUpdate + "]";
	}
	
	



}
