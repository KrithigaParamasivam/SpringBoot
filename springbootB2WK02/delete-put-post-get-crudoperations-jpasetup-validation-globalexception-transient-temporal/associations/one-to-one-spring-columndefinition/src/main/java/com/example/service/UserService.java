package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.UserDetails;
import com.example.repository.UserDetailsRepository;
import com.example.repository.UserRepository;

@Service
public class UserService {
   @Autowired
	private UserDetailsRepository repo;
	public List<UserDetails> getUserDetails() {
		return repo.findAll();
	}

	public void saveUserDetails(UserDetails userdetails) {
		repo.save(userdetails);
		
	}

	

}
