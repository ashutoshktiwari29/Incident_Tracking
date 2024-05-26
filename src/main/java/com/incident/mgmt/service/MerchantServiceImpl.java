package com.incident.mgmt.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.incident.mgmt.dao.MerchantDao;
import com.incident.mgmt.dao.UserDao;
import com.incident.mgmt.entity.Merchant_details;
import com.incident.mgmt.entity.User;

@Service
public class MerchantServiceImpl implements MerchantService {

	@Autowired
	MerchantDao merchantDao;

	@Autowired
	UserDao userRepo;

	@Override
	public String addMerchant(Merchant_details m_user) {
		// TODO Auto-generated method stub
		User user =m_user.getUser();
		if(user==null || user.getEmail()==null || user.getMobile()==null || m_user.getMerchant_name()==null) {
			return "Please provide complete details";
		}
		//check merchant Name.		
		if((merchantDao.findMerchantrByName(m_user.getMerchant_name())).size()!=0){
			return "Merchant name already used";
		}

		//Check email and mobile no.
		if((userRepo.findUserByEmailORMobile(user.getMobile(),user.getEmail())).size()==0){
			return merchantDao.save(m_user).toString();
		}else {
			return "Mobile or Email already in used, Please provide Unique Mobile,Email OR try to login";
		}


	}

	@Override
	public String updateMerchant(Merchant_details m_user) {
		// TODO Auto-generated method stub
		if(m_user==null || m_user.getMerchant_name()==null || m_user.getMerchant_id()==0) {
			return "Please provide valid merchant details";
		}
		
		Optional<Merchant_details> oldMerchant=merchantDao.findById(m_user.getMerchant_id());
		if(!oldMerchant.isPresent()) {
			return "Merchant id not found";
		}
		//check merchant Name.
		if((merchantDao.findMerchantrByNameWithUserId(m_user.getMerchant_name(),m_user.getMerchant_id())).size()!=0){
			return "Merchant name already used";
		}
		merchantDao.upadteMerchantrName(m_user.getMerchant_name(),m_user.getMerchant_id());
		return "Record updated successfully";

	}

}
