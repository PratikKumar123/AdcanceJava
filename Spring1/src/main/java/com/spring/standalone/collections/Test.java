package com.spring.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {

		ApplicationContext e = new ClassPathXmlApplicationContext("com/spring/standalone/alone.xml");
		
		Student s1 = (Student)e.getBean("stud1");
		System.out.println(s1);
	}
}
