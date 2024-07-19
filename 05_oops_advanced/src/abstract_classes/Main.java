package abstract_classes;

public class Main {
    public static void main(String[] args) {
        Bird b1 = new Crow();
        Bird b2 = new Pegion();

        b1.fly();
        b2.fly();
    }
}

// Abstract classes are used when we want common method to be declared in the parent class.
// and make overriding a compulsory for all base class.

// Charactersitics of Abstract classes:
// 1. It cannot be instantiated due to incomplete functionality.
// 2. It is compulsory for every child class to override the abstract method of
//    abstract class.
// 2. You can only extend one abstract class.