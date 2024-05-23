package com.incident.mgmt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
public class UserController {
	
	@Autowired
	UserService userService;
	
	@PostMapping("/add")
	ResponseEntity<?> addUser(@RequestBody User user){		
		String res=userService.addUser(user);
	    return new ResponseEntity<>(res, HttpStatus.OK);
			
	}
	
	@PutMapping("/update")
	ResponseEntity<?> updateUser(@RequestBody User user){
		String res=userService.updateUser(user);
	    return new ResponseEntity<>(res, HttpStatus.OK);			
	}
	
	@PostMapping("/login")
	ResponseEntity<?> login(@RequestBody Login login){
		String res=userService.login(login);
	    return new ResponseEntity<>(res, HttpStatus.OK);						
	}

}
