package inheritance;

public class SubTest extends SuperTest {
    public void helloSub(){
        System.out.println("Hey there!!!!! Hello from SubTest.........");
    }
    @Override
    public void func(){
        System.out.println();
        super.func(); // super being used to call the method of the super class.
        System.out.println("I am SubTest Func()........");
    }
}
