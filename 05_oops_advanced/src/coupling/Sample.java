package coupling;

public class Sample {
    private String title;
    private Demo abc;

    public Sample(String title, Demo abc){
        this.title = title;
        this.abc = abc;
    }

    public void exexute(){
        System.out.println(this.title);
        this.abc.hello();
    }
}
