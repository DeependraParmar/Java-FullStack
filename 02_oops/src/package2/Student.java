package package2;

import java.util.Scanner;

public class Student {
    private int roll;
    private String name;
    private final float[] marks;

    public Student(){
        this.marks = new float[5];
    }

    public void input(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the roll number of the student: ");
        this.roll = sc.nextInt();
        System.out.print("Enter the name of the student: ");
        this.name = sc.next();
        System.out.println("Enter the marks of the 5 subjects: ");

        for(int i=0; i<this.marks.length; i++){
            System.out.print("Marks of subject " + (i+1) + ": ");
            this.marks[i] = sc.nextFloat();
        }

        System.out.println();
    }
    public void show(){
        System.out.println("Roll No: " + this.roll);
        System.out.println("Name: " + this.name);
        System.out.print("Marks: [");

        for (float mark : this.marks) {
            System.out.print(mark + ",");
        }

        System.out.print("]");
    }
}

