package com.spring.expressionlang;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Oprations {
	@Value("#{20+60}")
	private int x ;
	
	@Value("#{ T(java.lang.Math).sqrt(144)}")
	private int y ;
	
	@Value("#{ new String('Pratik bhatt') }")
	private String name;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Oprations() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Oprations [x=" + x + ", y=" + y + ", name=" + name + "]";
	}

	
	

}
