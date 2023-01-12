package com.first;

import java.util.Date;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc = new Scanner(System.in);
    	
    	Configuration cfg = new Configuration();
    	cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        
        Student s = new Student();
        System.out.println("ENTER ID ");
        int id = sc.nextInt();
        s.setId(id);
        System.out.println("ENTER name ");
        String name = sc.next();
        s.setName(name);
        System.out.println("ENTER Regitratio  n ");
        int regid = sc.nextInt();
        s.setRegdNo(regid);
        System.out.println("ENTER Location ");
        String loc = sc.next();
        s.setLocation(loc);
        System.out.println(s);
        
        Address a = new Address();
        a.setAddressId(1001);
        a.setAddedDate(new Date());
        a.setCity("bokaro");
        a.setOpen(true);
        a.setStreet("bermo");
        
        Session session = factory.openSession();
        Transaction t = session.beginTransaction();
        
        session.save(s);
        session.save(a);
        
        t.commit();
        
        
        
        session.close();
        
    } 
}
