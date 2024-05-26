package com.incident.mgmt.service;

import com.incident.mgmt.entity.Merchant_details;

public interface MerchantService {

	public String addMerchant(Merchant_details m_user);

	public String updateMerchant(Merchant_details m_user);
}
