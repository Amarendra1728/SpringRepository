package com.spring.first._EmployeeApplication;

public class Employee {
private String name;
private int empId;
private int salary;
private int dptNo;
private String doj;
public Employee() {
	
}
public Employee(String name,int empId,int salary,int dptNo,String doj)
{
	this.name=name;
	this.empId=empId;
	this.salary=salary;
	this.dptNo=dptNo;
	this.doj=doj;
}
public void setName(String name)
{
	this.name=name;
}
public void setEmpId(int empId)
{
	this.empId=empId;
}
public void setSalary(int salary)
{
	this.salary=salary;
}
public void setDptNo(int dptNo)
{
	this.dptNo=dptNo;
}
public void setDoj(String doj)
{
	this.doj=doj;
}
public String getName()
{
	return this.name;
}
public int getEmpId()
{
	return this.empId;
}
public int getSalary()
{
	return this.salary;
}
public int getDptNo()
{
	return this.dptNo;
}
public String getDoj()
{
	return this.doj;
}
public void print() {
	System.out.println("Employee name:- "+getName());
	System.out.println("Employee Id:- "+getEmpId());
	System.out.println("Employee Salary:- "+getSalary());
	System.out.println("Employee Department:- "+getDptNo());
	System.out.println("Date of Joining:- "+getDoj());
}
}
