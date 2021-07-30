package com.example.repository;

import com.example.entity.Product;
import com.example.entity.Productpkid;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Productpkid> {
   // Product findByName(String name);
}

