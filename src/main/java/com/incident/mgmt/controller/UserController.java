package com.incident.mgmt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.incident.mgmt.entity.Login;
import com.incident.mgmt.entity.User;
import com.incident.mgmt.service.UserService;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@PostMapping("/add")
	ResponseEntity<?> addUser(@RequestBody User user){		
		Object res=userService.addUser(user);
	    return new ResponseEntity<>(res, HttpStatus.OK);
			
	}
	@PutMapping("/update")
	ResponseEntity<?> updateUser(@RequestBody User user){
		Object res=userService.updateUser(user);
	    return new ResponseEntity<>(res, HttpStatus.OK);			
	}
	@PostMapping("/login")
	@CrossOrigin(origins = "http://localhost:4200")
	ResponseEntity<?> login(@RequestBody Login login){
		User res=userService.login(login);
	    return new ResponseEntity<>(res, HttpStatus.OK);						
	}

}
