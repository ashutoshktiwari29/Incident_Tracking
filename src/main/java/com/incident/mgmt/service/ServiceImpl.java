package com.incident.mgmt.service;

import java.lang.annotation.Annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.incident.mgmt.dao.Dao;

@Service
public class ServiceImpl implements IncidentService{

	@Autowired
	private Dao dao;
	
	@Override
	public String getIncidentDetails() {
		// TODO Auto-generated method stub
		//return "Return from Service IMPl";
		return dao.getIncidentDetails();
	}

	@Override
	public String getIncidentDetailsTest() {
		// TODO Auto-generated method stub
		return dao.getIncidentDetailsTest();
	}

	@Override
	public String getIncidentDetailsTest1() {
		// TODO Auto-generated method stub
		return dao.getIncidentDetailsTest1();
	}

	@Override
	public String getIncidentDetailsTest2() {
		// TODO Auto-generated method stub
		return dao.getIncidentDetailsTest2();
	}
	@Override
	public String getIncidentDetailsTest3() {
		// TODO Auto-generated method stub
		return dao.getIncidentDetailsTest3();
}


}
