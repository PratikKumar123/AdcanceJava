package com.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {

	public static void main(String[] args) {
		ApplicationContext e = new ClassPathXmlApplicationContext("com/collectionscollection.xml");
		Employee st = (Employee) e.getBean("emp");

		System.out.println(st.getName());
		System.out.println(st.getPhones());
		System.out.println(st.getAddress());
		System.out.println(st.getCourses());
	}

}
