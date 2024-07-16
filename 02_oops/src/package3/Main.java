package package3;

public class Main {
    public static void main(String[] args) {
        Student hey = new Student();
        Student updatedHey = hey;
        Student deependra = new Student(56, "Deependra Parmar", 87.7f);

        hey.show();
        System.out.println();
        deependra.show();

        // Hashcode are used to determine whether all the objects are different or not;
        System.out.println();
        System.out.println(hey.hashCode());
        System.out.println(updatedHey.hashCode());
        System.out.println(deependra.hashCode());
    }
}
