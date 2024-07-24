package threading;

public class Main {
    public static void main(String[] args) {
        Demo d1 = new Demo("Dewas");
        Demo d2 = new Demo("Indore");
        Demo d3 = new Demo("Ujjain");

        // Step 01: Inherit Thread class in Demo
        // Step 02: call start() with object to add threads in process queue
        // Step 03: Override the run method and write your code in it.

        d1.start();
        d2.start();
        d3.start();
    }
}

/*
    Single Tasking System: MS-DOS, which can only run single process at a time.
    Multitasking System: Multiple process or application can be run in parallel.

    Threads: A light-weight process or a part of process. Their aim to work in parallel.
    Single Threading: Single thread working in a process within a main thread.
    Multi-threading: Parallel processing within a single process.
*/