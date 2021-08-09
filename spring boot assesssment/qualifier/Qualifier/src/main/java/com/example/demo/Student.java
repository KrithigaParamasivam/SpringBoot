package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	private int sid;
	private String sname;
	private String tech;
	@Autowired
	@Qualifier("lap1")
	
	private Laptop laptop;
	
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	
	
	
	 public Laptop getLaptop() {
		return laptop;
	}
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
	public void show()
	 {
		 System.out.println("in show from student class");
		 laptop.compile();
	 }
	
	public void studentid()
	 {
		 System.out.println("101");
		
	 }
	public void studentname()
	 {
		 System.out.println("krithiga");
		
	 }
	
}
