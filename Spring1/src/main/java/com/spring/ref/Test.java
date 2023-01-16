package com.spring.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext e = new ClassPathXmlApplicationContext("com/spring/ref/ref.xml");
		A a = (A)e.getBean("aref");
		System.out.println(a.getX());
		
		System.out.println(a.getOb().getY());
		

		System.out.println(a);
	}

}
