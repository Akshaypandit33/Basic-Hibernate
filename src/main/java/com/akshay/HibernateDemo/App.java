package com.akshay.HibernateDemo;

import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    @SuppressWarnings("deprecation")
	public static void main( String[] args )
    {
        Alien alien=new Alien();
        alien.setId(1);
        alien.setName("xyz");
        alien.setEmail("xyz@gmail.com");
        Configuration con=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Alien.class);        SessionFactory sf= con.buildSessionFactory();
        Session session= sf.openSession();
        
//        to follow acid property 
        org.hibernate.Transaction tx=session.beginTransaction();
        session.save(alien);
        tx.commit();
    }
}
