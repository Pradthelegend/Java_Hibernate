package com.Prad.Lecture_143_OneToMany_and_ManyToOne;

import com.Prad.Lecture_142_OneToOne_Mapping.Developer1;
import com.Prad.Lecture_142_OneToOne_Mapping.Laptop1;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Arrays;

public class Lecture_143_OneToMany_and_ManyToOne {

    public static void main(String[] args) {

        Laptop2 l2 = new Laptop2();
        l2.setLid(1);
        l2.setBrand("Apple");
        l2.setRam(64);
        l2.setModel("M3");

        Laptop2 laptop2 = new Laptop2();
        laptop2.setLid(2);
        laptop2.setBrand("Asus");
        laptop2.setRam(16);
        laptop2.setModel("ROG");

        Developer2 d2 = new Developer2();
        d2.setdID(101);
        d2.setdName("Tommy");
        d2.setDtech("Backend");
        d2.setLaptops(Arrays.asList(l2,laptop2));

        l2.setDevPrad(d2);
        l2.setDevPrad(d2);

        SessionFactory sf = new Configuration() // We are doint the same thing as above just making it look neat.
                .addAnnotatedClass(com.Prad.Lecture_143_OneToMany_and_ManyToOne.Developer2.class)
                .addAnnotatedClass(com.Prad.Lecture_143_OneToMany_and_ManyToOne.Laptop2.class)
                .configure()
                .buildSessionFactory();

        Session session = sf.openSession();

        Transaction transaction = session.beginTransaction(); //You need a transaction for any write operation in Hibernate.
        session.persist(l2);
        session.persist(laptop2);
        session.persist(d2);
        transaction.commit();//Executes the SQL and actually writes the data to the database table.

        Developer2 dev = session.get(Developer2.class,101);
        System.out.println(dev);
        session.close();
        sf.close();
    }
}
