package com.first;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmDemo {
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
    	cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        
        Student stud1 = new Student();
        stud1.setId(10001);
        stud1.setName("Suman");
        stud1.setLocation("Bokaro Steel City");
        stud1.setRegdNo(10101);
        
        
        PhoneNo p = new PhoneNo();
        p.setMob(909387622);
        p.setAlternativeMob(54244262);
        
        stud1.setPh(p);
        
        
        Student stud2 = new Student();
        stud2.setId(1201);
        stud2.setName("Rshikesh");
        stud2.setLocation("Odisha");
        stud2.setRegdNo(20899);
        
        
        PhoneNo p1 = new PhoneNo();
        p1.setMob(000022222);
        p1.setAlternativeMob(919191919);
        
        stud2.setPh(p1);
        
        Session s = factory.openSession();
        
        Transaction t = s.beginTransaction();
        
        s.save(stud1);
        s.save(stud2);
        
        t.commit();
        
        s.close();
        
        
        factory.close();
	}

}
