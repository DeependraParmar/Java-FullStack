package exception_handling;

public class Main3 {
    public static void main(String[] args) {
        Sample s1 = Sample.getInstance();
        s1.fun();
    }
}
// Whenever you want to hide the method to create the object of the class. You can give the object of the class.
// For this, you can make the constructor - PRIVATE

class Sample{
    // Data Members
    private int x,y;

    private Sample(int x, int y) {
        super();
        this.x = x;
        this.y = y;
    }

    // These are called as Factory Methods: Creates the Object or produces it.
    // This is used to implement FACTORY PATTERN
    public static Sample getInstance(){
        return new Sample(0,0);
    }

    public void fun(){
        System.out.println("Function says: " + this.x + " " + this.y);
    }
}
