package com.Prad;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Lecture_137_Fetching_The_Data {

    public static void main(String[] args) {

        Students s = null;

        SessionFactory sf = new Configuration() // We are doint the same thing as above just making it look neat.
                .addAnnotatedClass(com.Prad.Students.class)
                .configure()
                .buildSessionFactory();

        Session session = sf.openSession();
        /*
        So whats happening below is:
        Hibernate looks at your Students entity class → sees it maps to students table.
        Finds the row where id = 3.
        Creates a Students object with that row’s data.
        Assigns it to "s".
         */
        s = session.get(Students.class,3);//Students.class literally means: “the Class object that represents the Students class.”

        session.close();
        System.out.println(s);
        sf.close();
    }
}
