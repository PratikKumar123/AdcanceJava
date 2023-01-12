package com.Hql;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	private int id;
	private String name;
	private int regdNo;
	
	private String location;

	public Student(int id, String name, int regdNo, String location) {
		super();
		this.id = id;
		this.name = name;
		this.regdNo = regdNo;
		this.location = location;
	}
	public Student() {
		super();
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
	public int getRegdNo() {
		return regdNo;
	}
	public void setRegdNo(int regdNo) {
		this.regdNo = regdNo;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", regdNo=" + regdNo + ", location=" + location + "]";
	}
	

}
