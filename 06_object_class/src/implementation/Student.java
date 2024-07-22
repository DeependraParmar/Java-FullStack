package implementation;

public class Student implements Comparable<Student> {
    private int roll_no;
    private String name;
    private float marks;

    public Student(int roll_no, String name, float marks) {
        this.roll_no = roll_no;
        this.name = name;
        this.marks = marks;
    }

    public void show(){
        System.out.println("Roll no of student is: " + this.roll_no);
        System.out.println("Name of the student is: " + this.name);
        System.out.println("Marks of the student is: " + this.marks);
    }

    @Override
    public int compareTo(Student obj) {
        return obj.roll_no;
    }
}
