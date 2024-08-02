package reflection;

public class Student {
    private int roll;
    private String name;
    private float marks;

    public void show(){
        System.out.println(this.roll + this.name + this.marks);
    }

    public void hello(int num){
        System.out.println((float) this.marks + num);
    }
}
