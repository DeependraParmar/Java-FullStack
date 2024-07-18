package entities;

import java.util.Scanner;

public class Student extends Person{
    private int roll_no;
    private float marks;

    public Student(){
        super();
    }

    public Student(int roll_no, float marks) {
        this.roll_no = roll_no;
        this.marks = marks;
    }

    public Student(String name, int age, String phone, int roll_no, float marks) {
        super(name, age, phone);
        this.roll_no = roll_no;
        this.marks = marks;
    }

    public void input(){
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter you roll no: ");
        this.roll_no = sc.nextInt();

        System.out.print("Enter your marks: ");
        this.marks = sc.nextFloat();
    }

    @Override
    public void show(){
        super.show();
        System.out.println("Roll Number is: " + this.roll_no);
        System.out.println("Marks is: " + this.marks);
    }
}
