package com.example.service;

import com.example.entity.Product;
import com.example.repository.ProductRepository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repository;

    public Product saveProduct(Product product) {
        return repository.save(product);
    }

    public List<Product> saveProducts(List<Product> products) {
        return repository.saveAll(products);
    }

    public List<Product> getProducts()  {
        return repository.findAll();
    }

//    public Product getProductByName(String name) {
//        return repository.findByName(name);
//
//    }
  

}