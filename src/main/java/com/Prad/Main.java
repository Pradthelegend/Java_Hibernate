package com.Prad;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

    public static void main(String[] args) {

        Students s1 = new Students();
        s1.setName("Prad");
        s1.setRollNo(1);
        s1.setAge(22);

        Configuration config = new Configuration();
        config.addAnnotatedClass(com.Prad.Students.class);
        config.configure();// This will load the configuration xml.
        SessionFactory sf = config.buildSessionFactory();
        Session session = sf.openSession();
       // https://github.com/Pradthelegend/Java_Hibernate.git

        Transaction transaction = session.beginTransaction();

        session.save(s1);
        transaction.commit();
        System.out.println(s1);
    }
}
