package com.incident.mgmt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.incident.mgmt.entity.Merchant_details;
import com.incident.mgmt.service.MerchantService;

@RestController
@RequestMapping("/merchant")
public class MerchantController {
	
	@Autowired
	MerchantService merchantService;
	
	@PostMapping("/add")
	ResponseEntity<?> addMerchant(@RequestBody Merchant_details m_user){		
		String res=merchantService.addMerchant(m_user);
	    return new ResponseEntity<>(res, HttpStatus.OK);
			
	}
	
	@PutMapping("/update")
	ResponseEntity<?> updateMerchant(@RequestBody Merchant_details m_user){
		String res=merchantService.updateMerchant(m_user);
	    return new ResponseEntity<>(res, HttpStatus.OK);			
	}
	

}
