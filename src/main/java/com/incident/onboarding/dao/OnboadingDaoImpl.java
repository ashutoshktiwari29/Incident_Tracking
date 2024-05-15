package com.incident.onboarding.dao;

import org.springframework.stereotype.Repository;

@Repository
public class OnboadingDaoImpl implements OnboardingDao{

	public String getIncidentDetails() {
		// TODO Auto-generated method stub
		return "Return from DAO Layer";
	}

	@Override
	public String getIncidentDetailsTest() {
		// TODO Auto-generated method stub
		return "Pinki";
	}
	@Override
	public String getIncidentDetailsTest1() {
		// TODO Auto-generated method stub
		return "ashutosh";
	}
	
	@Override
	public String getIncidentDetailsTest2() {
		return"annapurna";
	}
	@Override
	public String getIncidentDetailsTest3() {
		return"ashvi";
	}
}
