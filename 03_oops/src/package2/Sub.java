package package2;

/**
 Whenever you extend a subclass with super class and create an object of subclass,
 under the hood, internally, object of the super class is automatically created as
 it is required to do inheritance.

 Step 01: Parent is instantiated first.
 Step 02: Child is instantiated secondly later.
 */

public class Sub extends Super {
    public int x,y;

    public Sub(int a, int b){
        super(a,b);
        this.x = a-10;
        this.y = b-10;
    }

    @Override
    public void show(){
        super.show();
        System.out.println("X: " + x + ", Y: " + y);
    }
}
