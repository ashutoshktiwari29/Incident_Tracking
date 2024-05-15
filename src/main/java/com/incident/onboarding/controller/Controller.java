package com.incident.onboarding.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.incident.onboarding.service.OboardingService;

@RestController
public class Controller {
	
	@Autowired
	private OboardingService service;
	
	
	@GetMapping("/helloworld")
	public String Hello1() {
		//return "Hi iam pinki";
		//
		return service.getIncidentDetails();
	}
	
	@GetMapping("/helloworld-4")
	public String Hello2() {
		//return "Hi iam pinki";
		return service.getIncidentDetailsTest();
	}
	
	@GetMapping("/helloworld-5")
	public String Hello3() {
		//return "Hi iam ashutosh";
		return service.getIncidentDetailsTest1();	
	}
	@GetMapping("/helloworld-6")
	public String Hello4() {
		//return "Hi iam Annapurna";
		return service.getIncidentDetailsTest2();	
	}
	@GetMapping("/helloworld-7")
	public String Hello5() {
		//return "Hi iam Annapurna";
		return service.getIncidentDetailsTest3();	
	}

}
