package package3;

import java.util.Scanner;

public class Student {
    private int roll;
    private String name;
    private float marks;

    public Student(){}
    public Student(int roll, String name, float marks){
        super();
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }

    public void input(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the roll number of the student: ");
        this.roll = sc.nextInt();
        System.out.print("Enter the name of the student: ");
        this.name = sc.next();
        System.out.print("Enter the marks of the student: ");
        this.marks = sc.nextFloat();
        System.out.println();
    }
    public void show(){
        System.out.println("Roll No: " + this.roll);
        System.out.println("Name: " + this.name);
        System.out.println("Marks: " + this.marks);
    }
}
