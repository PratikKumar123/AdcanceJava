package cascading;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.ManyToOne.Answer;
import com.ManyToOne.Question;

public class CascadingEx {
	
public static void main(String[] args) {
	Configuration cfg = new Configuration();
	cfg.configure("hibernate.cfg.xml");
    SessionFactory factory = cfg.buildSessionFactory();
    
    
    Question q3 = new Question();
    q3.setQuestionId(10112);
    q3.setQuestion("Projects names");
    
    
    Answer a1 = new Answer(10001, "Banking management system");
    a1.setQue(q3);
    Answer a2 = new Answer(10002, "Library management system");
    a2.setQue(q3);
    Answer a3 = new Answer(10003, "School management system");
    a3.setQue(q3);
    Answer a4 = new Answer(10004, "College management system");
    a4.setQue(q3);
    
    List<Answer> l = new ArrayList<Answer>();
    l.add(a1);
    l.add(a2);
    l.add(a3);
    l.add(a4);
    
    q3.setAns(l);
    Session s  = factory.openSession();
    Transaction tx = s.beginTransaction();
 
    s.save(q3);
    
    
    
    
    tx.commit();
    s.close();
    
    

    
    
    factory.close();
}

}
