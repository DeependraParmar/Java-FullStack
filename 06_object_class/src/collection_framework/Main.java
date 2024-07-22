package collection_framework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        // Collection framework is STL of Java which provides a lot of features
        // on the top of data structures.
        // On the top, we have Collection Interface and below is the hierarchy.
        // It does have a lot of Interfaces like List and Set.
        // List Interface also have classes: ArrayList, LinkedList
        // Set Interface also have classes: HashSet, TreeSet

        /*
            ArrayList:
                1. Implemented using array
                2. Indexing support: yes
                3. Insertion order: maintained
                4. Duplicate elements: allowed
        */
        ArrayList<Integer> a1 = new ArrayList<Integer>();

        a1.add(10);
        a1.add(20);
        a1.add(30);
        a1.add(40);

        System.out.print("Array List Traversal using For Each: ");
        for(Integer a: a1){
            System.out.print(a + " ");
        }

        // another way to traverse the arraylist
        System.out.print("\nArray List Traversal using For Each (Consumer): ");
        a1.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.print(integer + " ");
            }
        });

        System.out.println();
        System.out.print("Printed using Lambda: ");
        a1.forEach(t -> System.out.print(t + " "));

        // ArrayList a2;
        // a2.add(20); // Default Generic Type is Object and is a risky thing.
    }
}
