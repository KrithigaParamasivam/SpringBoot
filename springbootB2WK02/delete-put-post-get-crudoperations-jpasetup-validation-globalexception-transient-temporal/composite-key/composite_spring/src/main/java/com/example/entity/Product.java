package com.example.entity;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

//@Data
//@AllArgsConstructor
//@NoArgsConstructor
@Entity
@EqualsAndHashCode
@Table(name = "composite_Tbl")
@IdClass(Productpkid.class)

public class Product {

    @Id
   // @GeneratedValue(strategy = GenerationType.AUTO)
    private int id; 
    @Id
    private int orderid;
    private String name;
    private int quantity;
    private String price;
    @Temporal(TemporalType.TIMESTAMP)
	private Date DateTime=new Date(System.currentTimeMillis());
    
	
    

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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	

	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", quantity=" + quantity + ", price=" + price + "]";
	}
    
    
}
