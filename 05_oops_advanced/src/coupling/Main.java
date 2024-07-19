package coupling;

public class Main {
    public static void main(String[] args) {
        Sample1 s1 = new Sample1();
        Sample2 s2 = new Sample2();

        Sample s = new Sample("Indore City", s2);
        s.exexute();
    }
}
