package jdbc_real_02;

public class Student {
    private int rollno;
    private String name;
    private int age;
    private String email;
    private float marks;

    public Student(){}

    public Student(int rollno, String name, int age, String email, float marks) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
        this.email = email;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", marks=" + marks +
                '}';
    }
}
