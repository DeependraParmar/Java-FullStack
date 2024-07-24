package threading2;

public class Demo implements Runnable {
    private final String title;

    public Demo(String title){
        super();
        this.title = title;
    }

    private void execute(){
        for (int i = 0; i <= 10; i++) {
            System.out.println(i + " : " + this.title);
        }
    }

    @Override
    public void run() {
        this.execute();
    }
}
