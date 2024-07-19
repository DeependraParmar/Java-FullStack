package interfaces;

public class Main {
    public static void main(String[] args) {
        Sample s1 = new Sample();
        s1.function1();
        s1.function2();
    }
}

// Interface is a purely abstract structure with default public specifier,
// static and final.

// Characteristics of Interfaces are:
// 1. They are purely-abstract structure.
// 2. Properties are default public, static and final.
// 3. In order to achieve abstraction without inheritance, we can achieve it
//    using interfaces.
// 4. Multiple interfaces can be implemented by a particular class.


// Types of Coupling:
// 1. Hard/tight coupling: dependency in which one in totally dependent on other
//      For eg. Friends and their friendship.

// 2. Loose coupling: dependency with flexibility.