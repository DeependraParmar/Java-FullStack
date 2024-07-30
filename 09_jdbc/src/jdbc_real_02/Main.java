package jdbc_real_02;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentService service1 = new StudentService();

        // getting list of all student
        ArrayList<Student> list = service1.listAll();
        // System.out.println(list);

        // getting specific student by roll no
        Student obj = service1.getByRoll(1);
         System.out.println(obj);

        // inserting a new student in the database
        // service1.addStudent();
    }
}
