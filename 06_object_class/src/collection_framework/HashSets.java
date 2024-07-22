package collection_framework;

import java.util.HashSet;

public class HashSets {
    public static void main(String[] args) {
        /*
        *   Hashset:
        *       1. Array implementation
        *       2. No Index support
        *       3. Unordered DS
        *       4. No duplicate data allowed
        *
        *   TreeSet:
        *       1. All same as above
        *       2. Keeps the data sorted in the best possible manner.
        *       3. NOTE - COMPARABLE OBJECTS are stored in TreeSet
        * */
        HashSet<String> h = new HashSet<String>();

        h.add("Deependra");
        h.add("Hey there");
        h.add("I am good");

        h.forEach(hs -> System.out.print(hs + " | "));

    }
}
