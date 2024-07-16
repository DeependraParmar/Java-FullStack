package package2;

public class Main2 {
    public static void main(String[] args) {
        Student students[] = new Student[3];

        // multiple object initialisation and input
        for(int i=0; i<students.length; i++){
            students[i] = new Student();
            students[i].input();
            System.out.println();
        }

        // priting values of students
        for(int i=0; i<students.length; i++){
            students[i].show();
            System.out.println();
        }
    }
}
