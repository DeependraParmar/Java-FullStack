package exception_handling;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age here: ");
        age = sc.nextInt();

        if(age > 20){
            System.out.println("Processing ....");
        }
        else{
            throw new RuntimeException("Age should be greater than 20.....");
        }
    }
}
