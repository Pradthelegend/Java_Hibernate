package com.Prad;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Lecture_138_Update_And_Delete_Objects {

    public static void main(String[] args) {

        Students s1 = new Students();
        s1.setName("Paul");
        s1.setRollNo(4);
        s1.setAge(33);

        Students s2= null;

        SessionFactory sf = new Configuration() // We are doint the same thing as above just making it look neat.
                .addAnnotatedClass(com.Prad.Students.class)
                .configure()
                .buildSessionFactory();

        Session session = sf.openSession();

        Transaction transaction = session.beginTransaction(); //You need a transaction for any write operation in Hibernate.

        /*What merge() will do:
        If the Students object (s1) has a primary key value that does not exist in the DB, Hibernate will run an INSERT → creates a new row.
        If the primary key already exists in the DB, Hibernate will run an UPDATE instead → modifies the existing row.
         */
        session.merge(s1);//merge() is used to update the data.

        s2 = session.get(Students.class,5);
        session.remove(s2);// remove() is used to delete data.It just needs the object.

        transaction.commit();//Executes the SQL and actually writes the data to the database table.
        System.out.println(s1);
        session.close();
        sf.close();

    }
}
