package inheritance;

public class Main {
    public static void main(String[] args) {
        SubTest sb1 = new SubTest();
        sb1.helloSuper(); // Inherited method: which doesn't belong to subclass.
        sb1.helloSub(); // Own Method: which do belong to subclass.

        sb1.func(); // overriden method
    }
}
