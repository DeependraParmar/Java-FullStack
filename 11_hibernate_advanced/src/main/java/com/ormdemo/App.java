package com.ormdemo;

import entity.Employee;
import lib.SessionFactoryBuilder;

public class App
{
    public static void main( String[] args ){
        SessionFactoryBuilder.buildFactory();

        SessionFactoryBuilder.closeFactory();
    }
}
