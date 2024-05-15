package com.incident.mgmt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.incident.mgmt.service.IncidentService;

@RestController
public class Controller {
	
	@Autowired
	private IncidentService incidentService;
	
	
	@GetMapping("/helloworld")
	public String Hello1() {
		//return "Hi iam pinki";
		//
		return incidentService.getIncidentDetails();
	}
	
	@GetMapping("/helloworld-4")
	public String Hello2() {
		//return "Hi iam pinki";
		return incidentService.getIncidentDetailsTest();
	}
	
	@GetMapping("/helloworld-5")
	public String Hello3() {
		//return "Hi iam ashutosh";
		return incidentService.getIncidentDetailsTest1();	
	}
	@GetMapping("/helloworld-6")
	public String Hello4() {
		//return "Hi iam Annapurna";
		return incidentService.getIncidentDetailsTest2();	
	}
	@GetMapping("/helloworld-7")
	public String Hello5() {
		//return "Hi iam Annapurna";
		return incidentService.getIncidentDetailsTest3();	
	}

}
