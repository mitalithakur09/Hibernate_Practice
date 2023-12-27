package com.project;

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
        System.out.println( "Hello World!" );
        
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.config.xml");
        
        SessionFactory sf = cfg.buildSessionFactory();
        
        Questions q1 = new Questions();
        q1.setId(1);
        q1.setQuestions("What is Java?");
        
        Answer a1 = new Answer();
        a1.setId(10);
        a1.setAnswer("Java is programming language.");
        q1.setAns(a1);
        
        Questions q2 = new Questions();
        q2.setId(2);
        q2.setQuestions("What is variable?");
        
        Answer a2 = new Answer();
        a2.setId(20);
        a2.setAnswer("Variable is a memory allocated to datatypes.");
        q2.setAns(a2);
        
        Session session= sf.openSession();
        Transaction tx = session.beginTransaction();
        session.save(q1);
        session.save(q2);
        session.save(a1);
        session.save(a2);
        
        tx.commit();
        
        session.close();
        
        
    }
}
