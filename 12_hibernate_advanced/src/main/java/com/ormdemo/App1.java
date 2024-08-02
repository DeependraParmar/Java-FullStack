package com.ormdemo;

import entity.Department;
import lib.SessionFactoryBuilder;
import org.hibernate.Session;

public class App1 {
    public static void main( String[] args )    {
        SessionFactoryBuilder.buildFactory();

        Department d1 = new Department("Sales", "Indore");
        Department d2 = new Department("Store", "Ujjain");
        Department d3 = new Department("Purchase", "Dewas");

        Session session = SessionFactoryBuilder.getSession();

        session.save(d1);
        session.save(d2);
        session.save(d3);
        session.beginTransaction().commit(); // ---> Save 3 records to db
        System.out.println("Operation done ....");

        SessionFactoryBuilder.closeFactory();
    }
}

/*
    Important Logs:
        1. For auto-incremented ID, use @GenerateValue(GenerationType.IDENTITY);
*/