package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.UserDetails;
import com.example.service.UserService;

@RestController
public class UserController {
	@Autowired
	private UserService service;
	@GetMapping(value = "/userdetails")
	public ResponseEntity<List<UserDetails>> findAllUser() {
		return new ResponseEntity<List<UserDetails>>(service.getUserDetails(), HttpStatus.OK);

	}

	@PostMapping(value = "/user")
	public ResponseEntity<String> addUser(@RequestBody UserDetails userdetails) {
		service.saveUserDetails(userdetails);
		return new ResponseEntity<String>("record saved successfully", HttpStatus.OK);
	}


}
