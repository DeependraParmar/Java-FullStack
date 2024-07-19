package anonymous_interfaces;

public class Main {
    public static void main(String[] args) {
        // Anonymous classes implementing the interface Test
        Test t1 = new Test() {
            @Override
            public void function1() {
                System.out.println("Function 01");
            }

            @Override
            public void function2() {
                System.out.println("Function 02");
            }
        };

        t1.function1();
        t1.function2();
    }
}
