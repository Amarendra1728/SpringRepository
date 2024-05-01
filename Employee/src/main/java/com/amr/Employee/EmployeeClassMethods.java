package com.amr.Employee;

public class EmployeeClassMethods {
	int empId;
	String empName;
	public void insert(int id,String name)
	{
		empId=id;
		empName=name;
	}
	public void print()
	{
		System.out.println(empId);
		System.out.println(empName);
	}
}
