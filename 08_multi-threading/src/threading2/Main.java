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

        // When you want your main thread to wait until a particular thread finishes
        // we can use thread.join() method

        try {
            t3.join(5000); // can wait for 5s otherwise, it will not wait.
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("*** Main Thread Ends, Thanks ***");
    }
}

/*
    Stages of a Thread:
        1. Runnable: Object created and added to process queue.
        2. Running: Processing and executing.
        3. Waiting: Processor taken from the thread back, and it is waiting
        4. Dead: Either starved away or finished with task.
*/