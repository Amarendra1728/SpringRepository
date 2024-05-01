package com.spring.first.EmployeeJavaConfig;

public class Address {
private String contry;
private String state;
private String city;
public Address() {
	
}
public Address(String contry,String state,String city)
{
	this.contry=contry;
	this.state=state;
	this.city=city;
}
public String getContry() {
	return contry;
}
public void setContry(String contry) {
	this.contry = contry;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
}
