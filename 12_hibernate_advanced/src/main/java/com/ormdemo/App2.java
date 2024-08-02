package com.ormdemo;

import entity.Department;
import entity.Employee;
import lib.SessionFactoryBuilder;
import org.hibernate.Session;

public class App2 {
    public static void main( String[] args )    {
        SessionFactoryBuilder.buildFactory();
        Session session = SessionFactoryBuilder.getSession();

        // Getting the object of the department
        Department d1 = session.get(Department.class, 3);

        // creating the object of employee with relationship with department
        Employee e1 = new Employee(56, "Deependra Parmar", "deependraparmar1@gmail.com", 22.5f, d1);

        // saving and commiting the transaction
        session.save(e1);
        session.beginTransaction().commit();

        SessionFactoryBuilder.closeFactory();
    }
}

/*
    Important Logs:
        1. Relationships in hibernate is super-interesting.
*/