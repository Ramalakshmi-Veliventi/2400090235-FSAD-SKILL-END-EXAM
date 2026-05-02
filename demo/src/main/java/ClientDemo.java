package com.klef.fsad.exam;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import java.util.Date;

public class ClientDemo 
{
    public static void main(String[] args) 
    {
        SessionFactory sf = new Configuration().configure().buildSessionFactory();
        Session s = sf.openSession();

        // INSERT
        s.beginTransaction();

        Course c = new Course();
        c.setName("Java");
        c.setDescription("Hibernate");
        c.setDate(new Date());
        c.setStatus("Active");

        s.save(c);
        s.getTransaction().commit();

        // FETCH
        Course c1 = s.get(Course.class, c.getId());
        System.out.println(c1.getId() + " " + c1.getName());

        s.close();
        sf.close();
    }
}