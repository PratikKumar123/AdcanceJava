package com.spring.cons;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext e = new ClassPathXmlApplicationContext("com/spring/cons/cons.xml");
		Student s = (Student)e.getBean("stud");
		System.out.println(s);

		Addition a = (Addition)e.getBean("add");
		a.sum();
	}

}
