package com.spring.standalone.collections;

import java.util.List;
import java.util.Map;

public class Student {
	
	private List<String> names;
	private Map<Integer, String> namesreg;
	public List<String> getNames() {
		return names;
	}
	public void setNames(List<String> names) {
		this.names = names;
	}
	public Map<Integer, String> getNamesreg() {
		return namesreg;
	}
	public void setNamesreg(Map<Integer, String> namesreg) {
		this.namesreg = namesreg;
	}
	public Student(List<String> names, Map<Integer, String> namesreg) {
		super();
		this.names = names;
		this.namesreg = namesreg;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [names=" + names + ", namesreg=" + namesreg + "]";
	}
	
	

}
