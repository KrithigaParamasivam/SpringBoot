package com.example.controller;
import com.example.entity.Product;
import com.example.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import javax.validation.Valid;

@RestController
public class ProductController {

    @Autowired
    private ProductService service;

//    @PostMapping("/addProduct")
//    public Product addProduct(@RequestBody Product product) {
//        return service.saveProduct(product);
//    }
//
//    @PostMapping("/addProducts")
//    public List<Product> addProducts(@RequestBody List<Product> products) {
//        return service.saveProducts(products);
//    }
//
//    @GetMapping("/products")
//    public List<Product> findAllProducts() {
//        return service.getProducts();
//    }
//
//    @GetMapping("/productById/{id}")
//    public Product findProductById(@PathVariable int id) {
//        return service.getProductById(id);
//    }
//
//    @GetMapping("/product/{name}")
//    public Product findProductByName(@PathVariable String name) {
//        return service.getProductByName(name);
//    }
//
//    @PutMapping("/update")
//    public Product updateProduct(@RequestBody Product product) {
//        return service.updateProduct(product);
//    }
//
//    @DeleteMapping("/delete/{id}")
//    public String deleteProduct(@PathVariable int id) {
//        return service.deleteProduct(id);
//    }
    
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
	
//	@GetMapping(value="/product/{productName}")
//	public ResponseEntity<Product> findProductByName(@PathVariable String productName) throws Exception{
//		Product productList=service.getProductByName(productName);
//		ResponseEntity<Product> response= new ResponseEntity<Product>(productList, HttpStatus.OK);
//		return response;
//	}

//	@PostMapping(value="/addproduct")
	@PostMapping(value="/products")
	public ResponseEntity<String> addProduct(@Valid @RequestBody Product product) {
		service.saveProduct(product);
		String successMessage="Product added successfully.";
		ResponseEntity<String> response= new ResponseEntity<String>(successMessage,HttpStatus.CREATED);
		return response;
	}
    
	
//	 @PutMapping("/update")
	 @PutMapping("/products")
      public ResponseEntity<String> updateProduct(@RequestBody Product product) {
      service.updateProduct(product);
      String successMessage="Product updated successfully.";
      ResponseEntity<String> response= new ResponseEntity<String>(successMessage,HttpStatus.OK);	
      return response;
   }

	

//	@DeleteMapping(value="/delete/{id}")
	 @DeleteMapping(value="/products/{id}")
	public ResponseEntity<String> deleteCustomer(@PathVariable Integer id) throws Exception{
		service.deleteProduct(id);
		String successMessage="Product deleted successfully.";
		ResponseEntity<String> response= new ResponseEntity<String>(successMessage, HttpStatus.OK);
		return response;
	}

}
