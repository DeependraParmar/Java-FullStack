package entities;

public class Person{
    private String name;
    private int age;
    private String phone;

    public Person(){
        super();
    }

    public Person(String name, int age, String phone){
        super();
        this.name = name;
        this.age = age;
        this.phone = phone;
    }

    public void show(){
        System.out.println();
        System.out.println("Name is: " + this.name);
        System.out.println("Age is: " + this.age);
        System.out.println("Phone number is: " + this.phone);
    }
}
