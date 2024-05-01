package com.spring.first.EmployeeJavaConfig;

public class Employee {
	
private int id;
private String name;
private int sal;
private String dept;
private Address add;

public Employee() {
	
}
public Employee(int id,String name,int sal,String dept,Address add)
{
	this.id=id;
	this.name=name;
	this.sal=sal;
	this.dept=dept;
	this.add=add;
}

public Address getAdd() {
	return add;
}
public void setAdd(Address add) {
	this.add = add;
}
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
public int getSal() {
	return sal;
}
public void setSal(int sal) {
	this.sal = sal;
}
public String getDept() {
	return dept;
}
public void setDept(String dept) {
	this.dept = dept;
}
public void print()
{
	System.out.println("Id: "+getId());
	System.out.println("Name: "+getName());
	System.out.println("Salary: "+getSal());
	System.out.println("Department: "+getDept());
	System.out.println("------Address-----");
	System.out.println("Contry: "+getAdd().getContry());
	System.out.println("State: "+getAdd().getState());
	System.out.println("City: "+getAdd().getCity());
//	// or
//	System.out.println("Contry: "+add.getContry());
//	System.out.println("State: "+add.getState());
//	System.out.println("City: "+add.getCity());
}

}
