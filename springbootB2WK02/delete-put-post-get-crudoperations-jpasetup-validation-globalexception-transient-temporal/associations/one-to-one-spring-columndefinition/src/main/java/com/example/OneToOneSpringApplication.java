package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;

import com.example.entity.UserDetails;
import com.example.repository.UserDetailsRepository;
import com.example.repository.UserRepository;

@SpringBootApplication
public class OneToOneSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(OneToOneSpringApplication.class, args);
	}	
}
