package com.Employee;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg = new Configuration();
    	cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();

        Emp e1 = new Emp();
        Emp e2 = new Emp();
        
        e1.setEid(101);
        e1.seteName("Pratik");
        
        
        e2.setEid(102);
        e2.seteName("Suman");
        
        Project p1= new Project();
        Project p2= new Project();
        p1.setPid(1001);
        p1.setProjectName("Banking System");
        
        p2.setPid(1002);
        p2.setProjectName("Login System");
        
        List<Emp> l1 = new ArrayList<Emp>();
        
        List<Project> pr1 = new ArrayList<Project>();
        
        
        l1.add(e1);
        l1.add(e2);
        
        pr1.add(p1);
        pr1.add(p2);
        
        
        e1.setProjects(pr1);
        p2.setEmp(l1);
        
        

        Session session = factory.openSession();
        Transaction t = session.beginTransaction();

        session.save(e1);
        session.save(e2);
        session.save(p1);
        session.save(p2);

        
        t.commit();
        
        session.close();
        
        
        factory.close();
    }
}
