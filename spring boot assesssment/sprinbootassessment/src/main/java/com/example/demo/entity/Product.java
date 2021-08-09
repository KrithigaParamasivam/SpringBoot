package com.example.demo.entity;
import java.util.Date;


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
@Table(name = "product_Tbl")

public class Product {

    @Id
   // @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
   
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
