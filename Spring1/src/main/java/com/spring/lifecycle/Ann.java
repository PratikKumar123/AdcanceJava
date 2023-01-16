package com.spring.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Ann {

	private String rate;

	public String getRate() {
		return rate;
	}

	public void setRate(String rate) {
		this.rate = rate;
	}

	public Ann() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Ann [rate=" + rate + "]";
	}
	@PostConstruct
	public void start() {
		System.out.println("starting");
	}
	@PreDestroy
	public void destroy() {
		System.out.println("end");
	}
	
}
