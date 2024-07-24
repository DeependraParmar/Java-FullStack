package threading2;

public class Main {
    public static void main(String[] args) {
        Demo d1 = new Demo("Dewas");
        Demo d2 = new Demo("Indore");
        Demo d3 = new Demo("Ujjain");

        Thread t1 = new Thread(d1);
        Thread t2 = new Thread(d2);
        Thread t3 = new Thread(d3);

        // Step 01: Implement the Runnable Interface.
        // Step 02: Override the run method and write your code in this.
        // Step 03: Create object of Thread and give them runnable.
        // Step 04: start() using thread objects.


        t1.start();
        t2.start();
        t3.start();
    }
}
