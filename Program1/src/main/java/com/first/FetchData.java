package com.first;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchData {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
    	cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        Session sess = factory.openSession();
        
        //get-load
        Student s = (Student)sess.load(Student.class, 2);
        System.out.println(s);
        
        System.out.println("Address table");
       Address a = (Address)sess.get(Address.class, 1) ;
       System.out.println(a.getAddressId());
        
	}

}
