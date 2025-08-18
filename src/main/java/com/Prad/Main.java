package com.Prad;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

    public static void main(String[] args) {

        Students s1 = new Students();
        s1.setName("Paul");
        s1.setRollNo(4);
        s1.setAge(35);

//        Configuration config = new Configuration();
//        config.addAnnotatedClass(com.Prad.Students.class);// This is kinda like : “Hey Hibernate, this Java class is special — it’s an entity mapped to a database table.
//                                                          //Go look at its annotations (@Entity, @Table, @Column, etc.) and figure out how to store and retrieve it.”
//        config.configure();// This will load the configuration xml.


        SessionFactory sf = new Configuration() // We are doint the same thing as above just making it look neat.
                .addAnnotatedClass(com.Prad.Students.class)
                .configure()
                .buildSessionFactory();
        Session session = sf.openSession();

        Transaction transaction = session.beginTransaction(); //You need a transaction for any write operation in Hibernate.

        session.persist(s1);
        transaction.commit();//Executes the SQL and actually writes the data to the database table.
        System.out.println(s1);
        session.close();
        sf.close();
    }
}
