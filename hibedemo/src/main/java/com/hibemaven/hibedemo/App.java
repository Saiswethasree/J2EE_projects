 package com.hibemaven.hibedemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        Swetha s = new Swetha();
        s.setId(12);
        s.setName("swetha");
        s.setColor("white");
        
        Configuration con = new Configuration();
        
//        con.configure("persistence.xml");
        
        SessionFactory sf = con.buildSessionFactory();
        
        Session session = sf.openSession();
        
        Transaction tx = session.beginTransaction();
        
        session.save(s);
        
        tx.commit();
        
        session.close();
        
        System.out.println("record saved successfully");
    }
}
