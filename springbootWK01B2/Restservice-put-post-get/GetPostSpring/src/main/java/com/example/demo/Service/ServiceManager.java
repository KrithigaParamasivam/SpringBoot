package com.example.demo.Service;

import java.util.List;

import com.example.demo.vo.Product;

public interface ServiceManager {
	public List<String> getProduct();
	public void persitProduct(Product prod);
	public List<Product> fetchAllProd();

}
