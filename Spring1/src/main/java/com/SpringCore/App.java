package com.SpringCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        
       ApplicationContext c =  new ClassPathXmlApplicationContext("config.xml");
      Student st = (Student)c.getBean("stud1");
      Student st1 = (Student)c.getBean("stud2");
      System.out.println(st);
      System.out.println("____________");
      System.out.println(st1);
    }
}
