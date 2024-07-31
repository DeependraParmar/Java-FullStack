package com.ormdemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main( String[] args ) {
        Configuration cfg = new Configuration();
        cfg.configure(); // reading the configuration file (hibernate.cfg.xml)

        try (SessionFactory sessionFactory = cfg.buildSessionFactory()) {
            Session session = sessionFactory.openSession();

            Student ob = session.get(Student.class, 56);
            System.out.println(ob);

            Student obj = new Student(33, "Anushka", 20, "anushka21@gmail.com", 7.87f);
            session.beginTransaction().commit();
            session.save(obj);

            session.close();
        }

        System.out.println("Configuration done.....");
    }
}


/*
    Hibernate is an ORM Tool for Java. One of the most traditional, widely-used RDBMS tool.

    Object Relationship Mapping

    Object is related to a Class.
    Record/Row is related to a table in RDBMS.

    ORM tools like Hibernate just makes relation between the Object of the Class and
    Record in the table. ORM is a tool does automatic object-record mapping.

    As a developer, you just need to explain the database and class mapping between
    the object and record/row in the table. Once, its is done, you are good to go.


    In Hibernate, there are multiple things to take care of:
    1. Configuration: This is the object which is used to provide setting and config urls.
            > DB Information: DB Url, its information, id, passwords
            > Dialect: ( Way of speaking or tone, modulation ) used to specify which database
                        you as a developer is using.
            > Mapping: relationship between the table, relation and the objects.

    2. SessionFactory: SessionFactory provides the objects of the Session Class.
           SessionFactory's object is provided by configuration.
    3. Session: Session class has all the methods for CRUD via Hibernate.

            Configuration ---> SessionFactory ---> Session

    4. Query:
    5. Transaction:
    6. Criteria:

*/