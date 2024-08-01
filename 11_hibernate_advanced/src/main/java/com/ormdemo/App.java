package com.ormdemo;

import entity.Employee;
import lib.SessionFactoryBuilder;
import services.EmployeeService;

public class App
{
    public static void main( String[] args ){
        EmployeeService employeeService = new EmployeeService();
        SessionFactoryBuilder.buildFactory();

//        Employee e1 = new Employee(12, "Aditya Paliwal", 20, "adityapaliwal243@gmail.com", null);
//        employeeService.addEmployee(e1);

        Employee e = employeeService.getById(3);
        System.out.println(e);

        SessionFactoryBuilder.closeFactory();
    }
}
