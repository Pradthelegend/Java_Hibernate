package com.Prad.Lecture_142_OneToOne_Mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Lecture_142_OneToOne_Mapping {

    public static void main(String[] args) {

        Laptop1 l1 = new Laptop1();
        l1.setBrand("Apple");
        l1.setRam(64);
        l1.setModel("M3");

        Developer1 d1 = new Developer1();
        d1.setdID(1);
        d1.setdName("Tommy");
        d1.setDtech("Backend");
        d1.setLaptop(l1);

        SessionFactory sf = new Configuration() // We are doint the same thing as above just making it look neat.
                .addAnnotatedClass(com.Prad.Lecture_142_OneToOne_Mapping.Developer1.class)
                .addAnnotatedClass(com.Prad.Lecture_142_OneToOne_Mapping.Laptop1.class)
                .configure()
                .buildSessionFactory();

        Session session = sf.openSession();

        Transaction transaction = session.beginTransaction(); //You need a transaction for any write operation in Hibernate.
        session.persist(l1);
        session.persist(d1);
        transaction.commit();//Executes the SQL and actually writes the data to the database table.
        session.close();
        sf.close();
    }
}
