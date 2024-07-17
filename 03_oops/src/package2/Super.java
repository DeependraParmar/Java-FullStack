package package2;

public class Super {
    private int a,b;

    public Super(){}

    public Super(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void show(){
        System.out.println("A: " + this.a + ", B: " + this.b);
    }
}
