package com.spring.first._StudentApplication;

public class StudentClass {
	int id;
	String name;
	String course;
	int batch;
	String location;
	public StudentClass(){
		
	}
	public StudentClass(int id,String name,String course,int batch,String location)
	{
		this.id=id;
		this.name=name;
		this.course=course;
		this.batch=batch;
		this.location=location;
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
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public int getBatch() {
		return batch;
	}
	public void setBatch(int batch) {
		this.batch = batch;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public void print()
	{
		System.out.println("id       : "+getId());
		System.out.println("name     : "+getName());
		System.out.println("course   : "+getCourse());
		System.out.println("batch    : "+getBatch());
		System.out.println("Location : "+getLocation());
	}
}
	