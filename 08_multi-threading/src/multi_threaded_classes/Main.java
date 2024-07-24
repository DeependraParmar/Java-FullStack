package multi_threaded_classes;

public class Main {
    public static void main(String[] args) {
        String s1 = "Indore";
        StringBuilder s2 = new StringBuilder("Dewas");
        StringBuffer s3 = new StringBuffer("Ujjain");

        /*
            1. StringBuilder is not thread safe.
            2. StringBuffer is a thread-safe class ie all methods are synchronized.
                Due to this property, StringBuffer can be used in multithreaded env.

            Similarly, we have Vector<E> whose methods are synchronized so, it can also
            be used in multithreaded env.
        */
    }
}
