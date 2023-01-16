package com.spring.autowiring.ann;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	
	@Autowired
	@Qualifier("ad1")
	private Address ad;


	public Address getAd() {
		return ad;
	}
	public void setAd(Address ad) {
		System.out.println("setting value");
		this.ad = ad;
	}


	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(Address ad) {
		super(); 	
		this.ad = ad;
		System.out.println("constructr value");
	}

	@Override
	public String toString() {
		return "Employee [ad=" + ad + "]";
	}
	
	
}
