package implementation;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        // In the line below, Student class is not comparable class and that's why cannot
        // be stored in tree
        TreeSet<Student> t1 = new TreeSet<Student>();
        t1.add(new Student(56, "Deependra Parmar", 87.7f));
        t1.add(new Student(12, "Aditya Paliwal", 97.7f));
        t1.add(new Student(35, "Arun Bhai", 77.7f));

        t1.forEach(t -> System.out.println(t));
    }
}
