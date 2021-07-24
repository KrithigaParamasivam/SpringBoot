package com.example.demo.Controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.ServiceManager;
import com.example.demo.vo.Product;

@RestController
public class MyController extends BaseController {
	@Autowired
	private ServiceManager service;
	
	@GetMapping(value="/getproduct", produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<String>> getProduct()
	{
		return new ResponseEntity<List<String>>(service.getProduct(),HttpStatus.OK);
	}
	 
	@PostMapping(value="/product",produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Product>> updateProduct(@RequestBody Product prod)
	{
		service.persitProduct(prod);
		return new ResponseEntity<List<Product>>(service.fetchAllProd(),HttpStatus.OK);
		
	}
	@PutMapping(value="/product",produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Product>> addProduct(@RequestBody Product prod)
	{
		service.persitProduct(prod);
		return new ResponseEntity<List<Product>>(service.fetchAllProd(),HttpStatus.OK);
		
	}
	 

}
