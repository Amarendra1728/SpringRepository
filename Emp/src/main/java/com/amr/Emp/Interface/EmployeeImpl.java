package com.amr.Emp.Interface;
public class EmployeeImpl implements EmpInterface {
	private String name;
	private int age;
	private int salary;
	public EmployeeImpl() {
		//Defalt Constructor
	}
	public EmployeeImpl(String name,int age,int salary) {
		this.name=name;
		this.age=age;
		this.salary=salary;
	}
	public void setName(String name) {
		this.name=name;	
	}
	public void setAge(int age) {
		this.age=age;
	}
	public void setSalary(int salary) {
		this.salary=salary;
	}
	public String getName() {
		
		return this.name;
	}
	public int getAge() {
		
		return this.age;
	}
	public int getSalary() {
		return this.salary;
	}

}
