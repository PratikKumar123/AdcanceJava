package com.Springjdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Springjdbc.StudentDao.StudentDao;
import com.spring.Enities.Student;

public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("Starting");
    	ApplicationContext c = new AnnotationConfigApplicationContext(configuration.class);
    	
    	StudentDao s =c.getBean("std",StudentDao.class);
    	Student s1 = new Student();
//    	s1.setId(1011);
//    	s1.setName("Rishikesh");
//    	s1.setEmail("rishi@gmail.com");
//    	s1.setLocation("Odisha");
    	
//    	int r = s.insert(s1);
    	
//    	s1.setId(1011);
//    	s1.setName("Rishikesh Rout"); 
//    	s1.setEmail("rishirout@gmail.com");
//    	s1.setLocation("Odisha, bbsr");
//    	
//    	int r = s.update(s1);
//    	
//    	int r =s.delete(1011);
    	
//    	Student s2 = s.getStudent(1);
//    	System.out.println(s2);
    	
    	List<Student> s6 = s.getallStudent();
    	for(Student r : s6) {
    		System.out.println(r);
    	}
    	
    }
}
