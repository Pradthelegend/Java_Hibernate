package com.Prad.Lecture_144_ManyToMany;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Arrays;

public class Lecture_144_ManyToMany {

    public static void main(String[] args) {

        Laptop3 firstLaptop = new Laptop3();
        firstLaptop.setLid(1);
        firstLaptop.setBrand("Apple");
        firstLaptop.setRam(64);
        firstLaptop.setModel("M3");

        Laptop3 secondLaptop = new Laptop3();
        secondLaptop.setLid(2);
        secondLaptop.setBrand("Asus");
        secondLaptop.setRam(16);
        secondLaptop.setModel("ROG");

        Laptop3 thirdLaptop = new Laptop3();
        thirdLaptop.setLid(3);
        thirdLaptop.setBrand("Dell");
        thirdLaptop.setRam(26);
        thirdLaptop.setModel("Megatron");

        Developer3 developerNumberOne = new Developer3();
        developerNumberOne.setdID(101);
        developerNumberOne.setdName("Tommy");
        developerNumberOne.setDtech("Backend");


        Developer3 developerNumberTwo = new Developer3();
        developerNumberTwo.setdID(102);
        developerNumberTwo.setdName("James");
        developerNumberTwo.setDtech("Design");

        Developer3 developerNumberThree = new Developer3();
        developerNumberThree.setdID(103);
        developerNumberThree.setdName("Luke");
        developerNumberThree.setDtech("AI-Ml");

        developerNumberOne.setLaptops(Arrays.asList(firstLaptop,secondLaptop));
        developerNumberTwo.setLaptops(Arrays.asList(secondLaptop,thirdLaptop));
        developerNumberThree.setLaptops(Arrays.asList(secondLaptop));


//        firstLaptop.setDev();
//        secondLaptop.setDev();

        SessionFactory sf = new Configuration() // We are doint the same thing as above just making it look neat.
                .addAnnotatedClass(com.Prad.Lecture_144_ManyToMany.Laptop3.class)
                .addAnnotatedClass(com.Prad.Lecture_144_ManyToMany.Developer3.class)
                .configure()
                .buildSessionFactory();

        Session session = sf.openSession();

        Transaction transaction = session.beginTransaction(); //You need a transaction for any write operation in Hibernate.
        session.persist(firstLaptop);
        session.persist(secondLaptop);
        session.persist(developerNumberTwo);
        transaction.commit();//Executes the SQL and actually writes the data to the database table.

        Developer3 dev = session.get(Developer3.class,101);
        System.out.println(dev);
        session.close();
        sf.close();
    }
}
