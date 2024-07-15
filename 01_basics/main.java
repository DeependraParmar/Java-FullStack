class main{
    public static void main(String[] args){
        System.out.println("Hey there");
        System.out.println("Good Morning all !");
    }
}

class Test1{}
class Test2{}

// .class file created is created with the name of the class present in the source code.
// For manual compilation ----> javac Filename.java
// For manual run         ----> java ClassName




// If I have multiple classes in a particular source file, multiple bytecodes are generated for them.
// But, Byte code which has the main function gets executed.

// Due to this fact, java's execution is slow as compared to c/cpp. In order to increase the execution, JIT (just in time present in JRE) compiles only the classes with significant code.