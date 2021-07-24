package com.example.demo.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.vo.Product;
@Service
public class ServiceManagerImpl implements ServiceManager {
	
	List<Product> myproducts=new ArrayList<>();
	@Override
	public List<String> getProduct()
	{
		return Arrays.asList("productId:1","productName:nokia","productPrice:40000","productQuantity:4");
	}

	@Override
	public void persitProduct(Product prod) {
		myproducts.add(prod);
		
	}
	@Override
	public List<Product> fetchAllProd() {
		return myproducts;
	}

	

}
