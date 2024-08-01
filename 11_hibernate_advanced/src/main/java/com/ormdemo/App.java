package com.ormdemo;

import entity.Employee;
import lib.SessionFactoryBuilder;
import services.EmployeeService;

public class App
{
    public static void main( String[] args ){
        EmployeeService employeeService = new EmployeeService();
        SessionFactoryBuilder.buildFactory();

//        Adding a new record
//        Employee e1 = new Employee(12, "Aditya Paliwal", 20, "adityapaliwal243@gmail.com", null);
//        employeeService.addEmployee(e1);

//          Getting the record by an id
//        Employee e = employeeService.getById(3);
//        System.out.println(e);

//        Getting all the records from the database
//        System.out.println(employeeService.getAllEmployee());

//        Updating the record or the object
//        Employee e = employeeService.getById(3);
//        e.setSalary(22.5f);
//        employeeService.updateEmployee(e);

//        Deleting the record
//        employeeService.deleteEmployee(35);

        SessionFactoryBuilder.closeFactory();
    }
}

/*
    Points to remember while working with Java and Hibernate
        1. When, you fetch a single record from the db and return it, hibernate creates
            object of the class from the "DEFAULT CONSTRUCTOR" so, it is mandatory for
            you to create a default constructor.
        2. You may have null values in the columns in the db but not in the primitives.
            So, always use Wrapper class which can store both null and not-null values.
*/



/*
    Important Points to Ponder:
        1. When you get the session from sessionFactory.openSession(), a cache is created
            and is destroyed when session.close();
        2. When you have some objects in the Java Program and provide it to hibernate,
            hibernate stores it in the cache and these objects are called as Persistent
            Objects which persists until cache is persistent.
        3. For making an object as Persistent Object, you call save() method which doesn't
            save directly to db. It is just stored in the cache.
        4. If you do session.save(emp) and then session.close(), it was first saved to cache and
            destroyed the cache but ultimately not saved to the database.
        5. Object is not saved to the db, until you do session.beginTransaction().commit();
        6. If once saved, and you changed thereafter like belo
            session.save(emp);
            emp.setAge(25);
            commit();

            followup: user will have age of 25 despite 20.


        7. Now, let's see how data/records come from db to you.
        8. Firstly, when you call get(), all objects fetched are made persistent objects.


        MORAL OF THE STORY

        Whenever you change persistent objects and commits it(), changes are directly made
        into the databases.

        One Stop solution to remove a persistent object from cache even letting the session
        open is session.detach(emp); -----> Now, making changes and committing will not
        get reflected to the database.

*/