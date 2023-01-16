package com.spring.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		AbstractApplicationContext e = new ClassPathXmlApplicationContext("com/spring/lifecycle/lifecycle.xml");

//		Book b = (Book)e.getBean("s1");
//		System.out.println(b);
		e.registerShutdownHook();
		
		Ann an = (Ann)e.getBean("a");
		System.out.println("annotation "+an);
	}

}
