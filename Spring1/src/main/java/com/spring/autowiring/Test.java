package com.spring.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {

	public static void main(String[] args) {
		

		ApplicationContext e = new ClassPathXmlApplicationContext("com/spring/autowiring/auti.xml");
		
		Employee e1 = (Employee)e.getBean("emp");
		System.out.println(e1);
	}

}
