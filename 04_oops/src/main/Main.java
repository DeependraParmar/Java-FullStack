package main;

import entities.Faculty;
import entities.Person;
import entities.Student;

public class Main {
    public static void main(String[] args) {
        // Student std1 = new Student("Deependra Parmar", 20, "6702947542", 56, 87.7f);
        // std1.input();
        // std1.show();

        // Faculty fac1 = new Faculty("Rohini Sharma", 40, "546546544", 87, 45000);
        // fac1.show();
        // fac1.canVote();


        // Dynamic method Dispatch
        Person p1 = new Student("Deependra Parmar", 20, "6702947542", 56, 87.7f);
        p1.show();
    }
}
