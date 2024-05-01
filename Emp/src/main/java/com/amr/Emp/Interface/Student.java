package com.amr.Emp.Interface;

public class Student {
private int rollno;
private String name;
private String course;
private int batch;
private String doj;
private String location;

public Student() {
	
}
public Student(int rollno,String name,String course,int batch,String doj,String location) {
	this.rollno=rollno;
	this.name=name;
	this.course=course;
	this.batch=batch;
	this.doj=doj;
	this.location=location;	
}
public void setRollNo() {
	this.rollno=rollno;
}
public void setName() {
	this.name=name;
}
public void setCourse() {
	this.course=course;
}
public void setBatch() {
	this.batch=batch;
}
public void setDoj() {
	this.doj=doj;
}
public void setLocation() {
	this.location=location;
}
public int getRollNo() {
	return this.rollno;
}
public String getName() {
	return this.name;
}
public String getCourse() {
	return this.course;
}
public int getBatch() {
	return this.batch;
}
public String getDoj() {
	return this.doj;
}
public String getLocation() {
	return this.location;
}
}
