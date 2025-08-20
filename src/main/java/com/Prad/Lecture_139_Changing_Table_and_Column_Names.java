package com.Prad;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Lecture_139_Changing_Table_and_Column_Names {

    public static void main(String[] args) {

        Engineer e1 = new Engineer();
        e1.seteID(1);
        e1.seteName("Thomas");
        e1.setTech("AI");

        SessionFactory sf = new Configuration() // We are doint the same thing as above just making it look neat.
                .addAnnotatedClass(com.Prad.Engineer.class)
                .configure()
                .buildSessionFactory();

        Session session = sf.openSession();

        Transaction transaction = session.beginTransaction(); //You need a transaction for any write operation in Hibernate.
        session.persist(e1);
        transaction.commit();//Executes the SQL and actually writes the data to the database table.
        session.close();
        sf.close();
    }
}
