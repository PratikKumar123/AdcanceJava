package com.OneToMany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Mainn {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
    	cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        
        Question q = new Question();
        q.setQuestionId(1);
        q.setQuestion("What is java ");
        
        Answer a = new Answer();
        a.setAnswerId(101);
        a.setAnswer("Java is programming language");
        
        q.setAns(a);
        
        
        Session session = factory.openSession();
        Transaction t = session.beginTransaction();
        
        session.save(q);
        session.save(a);
        
        
        t.commit();
        
        
        Question newq = (Question)session.get(Question.class, 1);
        System.out.println(newq.getQuestion());
        System.out.println(newq.getAns().getAnswer());
        
        session.close();
        
        
        factory.close();
	}

}
