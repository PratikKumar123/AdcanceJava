package com.Hql;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;


public class HQLExample {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
    	cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
//        Student s = new Student();
//        s.setId(103);
//        s.setName("Suman");
//        s.setRegdNo(87878);
//        s.setLocation("odisha");
        
        
        Session s1 = factory.openSession();
//        Transaction t = s1.beginTransaction();
        //reading
//        s1.save(s);
//        String q = "from Student where location='odisha' ";
//        String q = "from Student where location=:x ";
        String q = "from Student  as s where s.location=:x  and s.name=:n";
        
        
        Query c = s1.createQuery(q);
        
        c.setParameter("x", "odisha");
        c.setParameter("n", "Suman");
        
        List<Student> l = c.list();
        for(Student s2 : l) {
        	System.out.println(s2.getName()+ ":"+ s2.getRegdNo());
        }
        Transaction t = s1.beginTransaction();
        //deleting
        
//        System.out.println("Deleting");
//        Query c1= s1.createQuery("delete from Student where location=:a");
//        c1.setParameter("a", "odisha");
//        
//        int i = c1.executeUpdate();................................................................................
//        System.out.println("Deleted");
//        System.out.println(i);
        System.out.println("updating");
        Query c1= s1.createQuery("update Student set  location=:a where id=:i");
        c1.setParameter("a", "Banglore");
        c1.setParameter("i", 102);
        
        int i = c1.executeUpdate();
        System.out.println("updated");
        System.out.println(i);
        
        //how to execute join query
        
        
        
        t.commit();
        s1.close();
        factory.close();
	}
	
}
