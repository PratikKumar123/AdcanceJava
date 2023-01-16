package com.spring.autowiring;

public class Address {

	private String location;
	private int pincode;
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [location=" + location + ", pincode=" + pincode + "]";
	}

	
	
}
