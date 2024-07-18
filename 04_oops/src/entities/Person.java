package entities;

import java.util.Scanner;

public class Person{
    private String name;
    private int age;
    private String phone;

    Scanner sc = new Scanner(System.in);

    public Person(){
        super();
    }

    public Person(String name, int age, String phone){
        super();
        this.name = name;
        this.age = age;
        this.phone = phone;
    }

    public void input(){
        System.out.print("Enter your name: ");
        this.name = sc.nextLine();

        System.out.print("Enter you age: ");
        this.age = sc.nextInt();

        System.out.print("Enter your phone number: ");
        this.phone = sc.next();
    }

    public void show(){
        System.out.println();
        System.out.println("Name is: " + this.name);
        System.out.println("Age is: " + this.age);
        System.out.println("Phone number is: " + this.phone);
    }

    public void canVote(){
        if(this.age >= 18){
            System.out.println("*** You are eligible to Vote ***");
        }
        else{
            System.out.println("*** You are not eligible to Vote ***");
        }
    }
}
