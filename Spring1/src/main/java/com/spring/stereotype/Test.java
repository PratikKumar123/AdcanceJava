package com.spring.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		

	ApplicationContext e = new ClassPathXmlApplicationContext("com/spring/stereotype/stereo.xml");
	Student s = (Student)e.getBean("student");
	System.out.println(s);
	}

}
