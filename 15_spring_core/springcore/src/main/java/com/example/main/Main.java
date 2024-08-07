package com.example.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.spdemo1.ABC;
import com.example.spdemo1.DEF;
import com.example.spdemo1.PQR;
import com.example.spdemo1.XYZ;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//        ABC ob = context.getBean(ABC.class);
//        ABC ob = (ABC) context.getBean("a2");
//        System.out.println(ob);
        
        DEF obj = (DEF) context.getBean("d1");
        System.out.println(obj);
    }
}