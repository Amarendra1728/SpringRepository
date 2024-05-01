package com.amr.Employee;

public class EmployeeConstructor {
	int empId;
	String empName;
	String course;
	public EmployeeConstructor(int id,String name,String course)
	{
		this.empId=id;
		this.empName=name;
		this.course=course;
	}
	public void print()
	{
		System.err.println("Emp id:"+empId+"\n"+"Emp name:"+empName+"\n"+"Course:"+course);
		
	}

}
