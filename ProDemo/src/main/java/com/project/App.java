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
        
        Configuration cf = new Configuration();
        cf.configure("hibernate.cfg.xml");
        
        SessionFactory sf = cf.buildSessionFactory();
        
        Demo pro = new Demo();
        pro.setId(125);
        pro.setName("Ayush");
        pro.setCity("Dewas");
        
       Session session= sf.openSession();
       Transaction tx = session.beginTransaction();
       
       session.save(pro);
       tx.commit();
       
       session.close();
    }
}
