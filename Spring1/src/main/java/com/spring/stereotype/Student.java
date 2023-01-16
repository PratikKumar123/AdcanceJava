package com.spring.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {

	@Value("Pratik")
	private String firstName;
	
	@Value("Bhatt")
	private String lastName;
	
	@Value("#{list}")
	private List<Integer> idNo;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public List<Integer> getIdNo() {
		return idNo;
	}

	public void setIdNo(List<Integer> idNo) {
		this.idNo = idNo;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", idNo=" + idNo + "]";
	}

	
	
}
