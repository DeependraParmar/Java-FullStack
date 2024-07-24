package threading;

public class Demo {
    private final String title;

    public Demo(String title){
        super();
        this.title = title;
    }

    public void execute(){
        for (int i = 0; i <= 10; i++) {
            System.out.println(i + " : " + this.title);
        }
    }
}
