package com.spring;

public class Employee {
 
  int eId;
  String eName;
  String eAddress;
  int salary;
  
  
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}


public Employee(int eId, String eName, String eAddress, int salary) {
	super();
	this.eId = eId;
	this.eName = eName;
	this.eAddress = eAddress;
	this.salary = salary;
}


public int geteId() {
	return eId;
}


public void seteId(int eId) {
	this.eId = eId;
}


public String geteName() {
	return eName;
}


public void seteName(String eName) {
	this.eName = eName;
}


public String geteAddress() {
	return eAddress;
}


public void seteAddress(String eAddress) {
	this.eAddress = eAddress;
}


public int getSalary() {
	return salary;
}


public void setSalary(int salary) {
	this.salary = salary;
}


@Override
public String toString() {
	return "Employee [eId=" + eId + ", eName=" + eName + ", eAddress=" + eAddress + ", salary=" + salary + "]";
}


public void show()
{
	System.out.println(eName);
}
  
private Department department;


public Department getDepartment() {
	return department;
}


public void setDepartment(Department department) {
	this.department = department;
}

public void init() {
	System.out.println("init start");
}
public void destroy() {
	System.out.println("bean destroy");
}

  
}
  
  
