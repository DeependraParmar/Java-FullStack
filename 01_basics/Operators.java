import java.util.Scanner;

class Operators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // From the console, data comes in the format of Binary. Scanner basically converts the binary into corresponding datatype.

        int x, y, z;
        System.out.print("Enter the value of first number: ");
        x = sc.nextInt();
        System.out.print("Enter the value of second number: ");
        y = sc.nextInt();

        char ch;
        System.out.print("Enter the character here: ");
        ch = sc.next().charAt(0);

        z = x + y;

        System.out.println("Addition: " + z);
        System.out.println("Charcter is: " + ch);
    }
}


// If you are using any class without import, that means they all are present in java.lang