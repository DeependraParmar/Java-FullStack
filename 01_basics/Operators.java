import java.util.Scanner;

class Operators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // From the console, data comes in the format of Binary. Scanner basically converts the binary into corresponding datatype.

        int x, y, z;
        x = sc.nextInt();
        y = sc.nextInt();

        z = x + y;

        System.out.println("Addition: " + z);
    }
}


// If you are using any class without import, that means they all are present in java.lang