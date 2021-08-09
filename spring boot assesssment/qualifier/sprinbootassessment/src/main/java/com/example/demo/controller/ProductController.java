package com.example.demo.controller;
import com.example.demo.entity.Product;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController
public class ProductController {

    @Autowired
    private ProductService service;


    @GetMapping(value="/products")
	public ResponseEntity<List<Product>> findAllProducts() throws Exception{
		List<Product> productList=service.getProducts();
		ResponseEntity<List<Product>> response= new ResponseEntity<List<Product>>(productList, HttpStatus.OK);
		return response;
	}

	@GetMapping(value="/product/{productId}")
	public ResponseEntity<Product> findProductById(@PathVariable Integer productId) throws Exception{
		Product productList=service.getProductById(productId);
		ResponseEntity<Product> response= new ResponseEntity<Product>(productList, HttpStatus.OK);
		return response;
	}


	@PostMapping(value="/products")
	public ResponseEntity<String> addProduct(@RequestBody Product product) {
		service.saveProduct(product);
		String successMessage="Product added successfully.";
		ResponseEntity<String> response= new ResponseEntity<String>(successMessage,HttpStatus.CREATED);
		return response;
	}
    
	 @PutMapping("update")
      public ResponseEntity<String> updateProduct(@RequestBody Product product) {
      service.updateProduct(product);
      String successMessage="Product updated successfully.";
      ResponseEntity<String> response= new ResponseEntity<String>(successMessage,HttpStatus.ACCEPTED);	
      return response;
   }

	

	 @DeleteMapping(value="/delete/{id}")
	public ResponseEntity<String> deleteCustomer(@PathVariable Integer id) throws Exception{
		service.deleteProduct(id);
		String successMessage="Product deleted successfully.";
		ResponseEntity<String> response= new ResponseEntity<String>(successMessage, HttpStatus.ACCEPTED);
		return response;
	}

}
