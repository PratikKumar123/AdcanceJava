package com.spring.lifecycle;

public class Book {

	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Book [price=" + price + "]";
	}
	
	public void init() {
		System.out.println("Init");
	}
	public void destroy() {
		System.out.println("destroy");
	}
	
	
}
