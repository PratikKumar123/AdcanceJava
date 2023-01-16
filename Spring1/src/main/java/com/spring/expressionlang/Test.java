package com.spring.expressionlang;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext e = new ClassPathXmlApplicationContext("com/spring/expressionlang/express.xml");
		Oprations t = (Oprations)e.getBean("oprations");
		System.out.println(t);
		
		
	}

}
