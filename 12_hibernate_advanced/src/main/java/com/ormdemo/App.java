package com.ormdemo;

import lib.SessionFactoryBuilder;

public class App {
    public static void main( String[] args )    {
        SessionFactoryBuilder.buildFactory();



        SessionFactoryBuilder.closeFactory();
    }
}

/*
    Important Logs:
        1. For auto-incremented ID, use @GenerateValue(GenerationType.AUTO);
*/