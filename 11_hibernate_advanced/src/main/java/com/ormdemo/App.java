package com.ormdemo;

import entity.Employee;
import lib.SessionFactoryBuilder;
import services.EmployeeService;

public class App
{
    public static void main( String[] args ){
        EmployeeService employeeService = new EmployeeService();
        SessionFactoryBuilder.buildFactory();

        // Adding a new record
//        Employee e1 = new Employee(12, "Aditya Paliwal", 20, "adityapaliwal243@gmail.com", null);
//        employeeService.addEmployee(e1);

        // Getting the record by an id
//        Employee e = employeeService.getById(3);
//        System.out.println(e);

        // Getting all the records from the database
//        System.out.println(employeeService.getAllEmployee());

        Employee e = employeeService.getById(3);
        e.setSalary(22.5f);
        employeeService.updateEmployee(e);

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