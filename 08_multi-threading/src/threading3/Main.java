package threading3;

public class Main {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount(56, 75000);
        Transaction t1 = new Transaction(acc1, 20000, 3);

        t1.start();
    }
}
