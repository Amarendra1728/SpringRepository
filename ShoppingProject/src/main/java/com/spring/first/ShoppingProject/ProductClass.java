package com.spring.first.ShoppingProject;

public class ProductClass {
private int pid;
private String pName;
private int pPrice;
private int pQuantity;
public ProductClass()
{
	
}
public ProductClass(int pid,String pName,int pPrice,int pQuantity)
{
	this.pid=pid;
	this.pName=pName;
	this.pPrice=pPrice;
	this.pQuantity=pQuantity;
}
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getpName() {
	return pName;
}
public void setpName(String pName) {
	this.pName = pName;
}
public int getpPrice() {
	return pPrice;
}
public void setpPrice(int pPrice) {
	this.pPrice = pPrice;
}
public int getpQuantity() {
	return pQuantity;
}
public void setpQuantity(int pQuantity) {
	this.pQuantity = pQuantity;
}

}
