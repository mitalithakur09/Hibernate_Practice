package com.project;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.config.xml");
        
        SessionFactory sf = cfg.buildSessionFactory();
        
        EmbStudent std = new EmbStudent();
        std.setId(1);
        std.setName("Ayuu");
        std.setCity("Dewas");
        
        EmbCertificate ct = new EmbCertificate();
        ct.setCourse("PCM");
        ct.setDuration("1 year");
        std.setCerti(ct);
        
        EmbStudent std1 = new EmbStudent();
        std1.setId(2);
        std1.setName("Ayush");
        std1.setCity("Dewas");
        
        EmbCertificate ct1 = new EmbCertificate();
        ct1.setCourse("Diploma");
        ct1.setDuration("2 year");
        std1.setCerti(ct1);
        
        Session session   = sf.openSession();
        Transaction tx = session.beginTransaction();
        session.save(std);
        session.save(std1);
        tx.commit();
        
        session.close();
        sf.close();
        
        
    }
}
