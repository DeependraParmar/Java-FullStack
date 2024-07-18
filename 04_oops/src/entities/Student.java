package entities;

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

    @Override
    public void show(){
        super.show();
        System.out.println("Roll Number is: " + this.roll_no);
        System.out.println("Marks is: " + this.marks);
    }
}
