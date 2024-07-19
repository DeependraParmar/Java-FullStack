package functional_interfaces_and_lambda;

public class Main {
    public static void main(String[] args) {
        Test t1 = new Test() {
            @Override
            public void calculate(int a, int b) {
                System.out.println("Sum is: " + (a+b));
            }
        };

        // Lambda is used to directly give implementation of the function for functional
        // interface

        /*
        *   If your function is returning something, you can do like
        *   Test t = (a,b) -> a/b; // called as Lambda Expression.
        *
        *   Lambda is although an anonymous_class but it does not have seperate bytecode.
        *   It got attached to the bytecode of the main class its written in.
        **/

        Test t2 = (a,b) -> {
            System.out.println("Product is: " + (a*b));
        };
        Test t3 = (a,b) -> System.out.println("Division is: " + (a/b));

        t1.calculate(10,20);
        t2.calculate(10,20);
        t3.calculate(30,3);
    }
}
