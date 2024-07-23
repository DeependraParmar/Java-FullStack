package exception_handling;

public class Main1 {
    // Since, Unhandled code is written at functionB of class B and the exception
    // follows the hierarchy wherever the function is called or executed.

    // Handling should be done before coming to main otherwise, it will be redirected to JRE.

    public static void main(String[] args) {
        A a = new A();
        a.functionA();
    }
}

class A{
    public void functionA(){
        B b = new B();
        b.functionB();

        /*
        * other code for class A.
        * So, it's best to handle the exception here in the class A.
        *
        * */
    }
}

class B{
    public void functionB(){
        int a = 45/0;
        System.out.println(a);
    }
}