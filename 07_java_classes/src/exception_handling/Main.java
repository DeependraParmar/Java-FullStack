package exception_handling;

public class Main {
    // Exception is an abnormal event or condition which disrupts the
    // flow of execution of the program.

    /*
        Exception occurs due to:
            1. Logical Errors (Flaw from the Developer's End) : Null Exception, Class Cast Exception,
            IndexOutOfBoundException
            2. Third Party Resources, libraries, packages & services.

         Exception Handling:
            1. End User will see a readable message on error
            2. To know that in which module, the exception occurred for further clarity.
    */

    public static void main(String[] args) {
        String[] arr = {"55", "10"};

        try{
            int x = Integer.parseInt(arr[0]);
            int y = Integer.parseInt(arr[1]);
            int z = x+y;
            System.out.println("Sum is: " + z);
        }
        catch(Exception e){
            if(e instanceof ArrayIndexOutOfBoundsException){
                System.out.println("Please give two values for addition !");
            }
            if(e instanceof NullPointerException){
                System.out.println("Inculcating Null Somewhere");
            }
            if(e instanceof NumberFormatException){
                System.out.println("Please provide two numbers");
            }

            throw e;
        }
        finally {
            System.out.println(">> Finally Run <<");
            // code of finally gets executed everytime.
            // whenever, the exception cannot be handled, program gets terminated after executing finally.
            // finally is used in various use cases for e.g.
            // shut the db connection whether exception has occurred or not.
        }

        System.out.println();
        System.out.println("*** Thanks for working with me ***");

    }

}
