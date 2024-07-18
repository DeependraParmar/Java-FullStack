package entities;

public class Faculty extends Person{
    private int id;
    private float salary;

    public Faculty(){
        super();
    }

    public Faculty(String name, int age, String phone, int id, float salary){
        super(name, age, phone);
        this.id = id;
        this.salary = salary;
    }

    @Override
    public void show(){
        super.show();
        System.out.println("Faculty id is: " + this.id);
        System.out.println("Faculty's salary is: " + this.salary);
        System.out.println();
    }
}
