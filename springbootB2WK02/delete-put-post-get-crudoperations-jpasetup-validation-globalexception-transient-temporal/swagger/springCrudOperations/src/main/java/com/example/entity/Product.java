package com.example.entity;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
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
import javax.validation.constraints.NotBlank;
//import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

//@Data
//@AllArgsConstructor
//@NoArgsConstructor
@Entity
@Table(name = "product_Tbl")

public class Product {

    @Id
   // @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @NotBlank(message="Name is mandatory")
    @Size(min=5,message="Name must be 5 characters")
    private String name;
    @Transient
    private int quantity;
    @NotBlank(message="price is mandatory")
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
