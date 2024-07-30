package jdbc_real_02;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        StudentService service1 = new StudentService();
        ArrayList<Student> list = service1.listAll();

        System.out.println(list);
    }
}
