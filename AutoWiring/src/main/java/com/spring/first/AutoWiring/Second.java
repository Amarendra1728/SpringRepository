package com.spring.first.AutoWiring;

public class Second {
private int id;
private String name;
public Second()
{
 	
}
public Second(int id,String name)
{
	this.id=id;
	this.name=name;
	System.out.println("This is Second Constructor");
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
}
