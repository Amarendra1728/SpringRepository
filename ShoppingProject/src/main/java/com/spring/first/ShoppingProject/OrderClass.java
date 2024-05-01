package com.spring.first.ShoppingProject;

public class OrderClass {
	int orderId;
	ProductClass product;

	public OrderClass() {

	}

	public OrderClass(int orderId, ProductClass product) {
		this.orderId = orderId;
		this.product = product;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public ProductClass getProduct() {
		return product;
	}

	public void setProduct(ProductClass product) {
		this.product = product;
	}

	public void print() {
		System.out.println(getOrderId());
		System.out.println(getProduct().getPid());
		System.out.println(getProduct().getpName());
		System.out.println(getProduct().getpPrice());
		System.out.println(getProduct().getpQuantity());
	}

}
