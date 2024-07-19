package anonymous_classes;

public class Main {
    public static void main(String[] args) {
        Sample s1 = new Sample() {
            @Override
            void hello() {
                System.out.println("Hello from Anonymous Classes");
            }
        };

        // Bytecode of the anonymous classes will be there in the out folder of the package.
        // Format: ParentClass.$anonymous_class_no.class

        s1.function();
        s1.hello();
    }
}
