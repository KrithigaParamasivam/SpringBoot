package com.example.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "userdetails_tbl")
public class UserDetails {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name="id")
  private int id;
  
  @Column(name="Address")	
  private String Address;
  
  @Column(name="PhoneNumber")	
  private String phone;
  
  @OneToOne(cascade=CascadeType.ALL)
  @JoinColumn(name="user_id", referencedColumnName="id")
  private User user;
  
public User getUser() {
	return user;
}


public void setUser(User user) {
	this.user = user;
}


public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getAddress() {
	return Address;
}
public void setAddress(String address) {
	Address = address;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}



  
  
}
