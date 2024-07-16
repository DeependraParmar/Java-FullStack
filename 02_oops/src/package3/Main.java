package package3;

public class Main {
    public static void main(String[] args) {
        Student hey = new Student();
        Student deependra = new Student(56, "Deependra Parmar", 87.7f);

        hey.show();
        System.out.println();
        deependra.show();
    }
}
