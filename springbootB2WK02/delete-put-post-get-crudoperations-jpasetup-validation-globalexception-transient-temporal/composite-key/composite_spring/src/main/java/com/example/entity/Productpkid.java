package com.example.entity;

import java.io.Serializable;

import javax.persistence.Id;

public class Productpkid implements Serializable{
	
	private int id; 
    private int orderid;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getOrderid() {
		return orderid;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
    

}
