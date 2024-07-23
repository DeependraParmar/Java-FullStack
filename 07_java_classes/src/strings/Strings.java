package strings;

public class Strings {
    public static void main(String[] args) {
        String str = "Hello there, my name is Deependra Parmar";

        System.out.println("Character at index 10: " + str.charAt(10));
        System.out.println("Length of the string is: " + str.length());
        System.out.println("str getting compared: " + str.compareTo("hey"));
        System.out.println("String getting concatenated: " + str.concat(" , Good Morning"));
        System.out.println("String contains Deependra?: " + str.contains("Deependra"));

        // endsWith and startsWith is used to check the prefix and suffix of a string.

        System.out.println("Deependra is at index: " + str.indexOf("Deependra"));
        System.out.println("Gossip is at index: " + str.indexOf("Gossip")); // returns -1

        // toLowerCase() and toUpperCase() will return new string

        System.out.println("Substring is: " + str.substring(24, 33));
        System.out.println("Replaced String is: " + str.replace("Deependra Parmar", "DEEPENDRA PARMAR"));

    }
}
