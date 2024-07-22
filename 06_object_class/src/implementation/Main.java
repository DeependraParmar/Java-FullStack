package implementation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        // In the line below, Student class is not comparable class and that's why cannot
        // be stored in tree
        TreeSet<Student> t1 = new TreeSet<Student>();
        t1.add(new Student(56, "Deependra Parmar", 87.7f));
        t1.add(new Student(12, "Aditya Paliwal", 97.7f));
        t1.add(new Student(35, "Arun Bhai", 77.7f));

        t1.forEach(t -> System.out.print(t + " | "));

        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student(10, "Deependra", 45.433f));
        list.add(new Student(40, "Hello", 45.433f));
        list.add(new Student(90, "Anshul", 45.433f));
        list.add(new Student(70, "Gopal", 45.433f));

//        Collections.sort(list, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return o1.getRoll_no() - o2.getRoll_no();
//            }
//        }); // Below code can bè used in place of this.

        Collections.sort(list, (o1, o2) -> o1.getRoll_no() - o2.getRoll_no());
        System.out.println();
        System.out.println(list);
    }
}
