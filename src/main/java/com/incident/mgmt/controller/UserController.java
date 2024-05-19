package com.incident.mgmt.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.incident.mgmt.entity.User;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@PostMapping("/add")
	ResponseEntity<?> addUser(User user){
	    return new ResponseEntity<>(user.toString(), HttpStatus.OK);
		
		
		
	}

}
