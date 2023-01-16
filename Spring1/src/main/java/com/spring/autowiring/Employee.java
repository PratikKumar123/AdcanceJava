package com.spring.autowiring;

public class Employee {
	private Address ad;


	public Address getAd() {
		return ad;
	}

	public void setAd(Address ad) {
		this.ad = ad;
	}

	public Employee() {
		super();
	}
	@Override
	public String toString() {
		return "Employee [ad=" + ad + "]";
	}
	
	
}
