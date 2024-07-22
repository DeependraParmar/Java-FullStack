package wrapper_classes;

public class Main {
    public static void main(String[] args) {
        int x = 45; // Value type
        Integer i = null; // You can initialise reference of wrapper class with null in order to show the absence of value.

        // In primitive, null cannot be stored.
        // In order to use null, we need wrapper classes.


        // Boxing and unboxing:
        // Boxing: Putting value manually in the wrapper.
        // Unboxing: Getting the integer/ float value from the reference of the wrapper.

        // Integer z = new Integer(x.intValue() + y.intValue());

        Integer a = new Integer(45);
        Integer b = new Integer(20);

        Integer c = a + b; // automatic boxing and unboxing.
        int d = a + b; // also does automatic boxing and unboxing.
        System.out.println(c);


        // Then why do we need primitives?
        // Ans: All the operators works on primitives. You cannot do it on wrappers.
        // Wrappers can be used to keep null while, primitives cannot.
    }
}
