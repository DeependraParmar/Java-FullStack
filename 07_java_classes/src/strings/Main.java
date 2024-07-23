package strings;

public class Main {
    public static void main(String[] args) {
        // Strings belongs to Immutable classes.
        String str = "Hey there !!";
        System.out.println(str);
        System.out.println(str.hashCode());

        // Whenever you try to change it, it returns new object and do not
        // change the same object. They are not modifiable.

        str = "Hello there !!";
        System.out.println(str);
        System.out.println(str.hashCode());

        // If two strings have same values, they have same object and has
        // same hashCode()....
        System.out.println();
        String city1 = "indore";
        String city2 = "indore";

        System.out.println(city1.hashCode() + " " + city2.hashCode());


        // Similarly, the wrapper classes are also Immutable classes.
        Integer a = 20;
        Integer b = 20;
        Integer c = 20;

        System.out.println();
        System.out.println("Hashcode of a: " + a.hashCode());
        System.out.println("Hashcode of b: " + b.hashCode());
        System.out.println("Hashcode of c: " + c.hashCode());
    }
}
