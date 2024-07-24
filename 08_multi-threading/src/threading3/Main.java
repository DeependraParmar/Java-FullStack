package threading3;

public class Main {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount(56, 75000);


        Transaction t1 = new Transaction(acc1, 20000, Transaction.MODE_WITHDRAW);
        Transaction t2 = new Transaction(acc1, 10000, Transaction.MODE_WITHDRAW);
        Transaction t3 = new Transaction(acc1, 17000, Transaction.MODE_WITHDRAW);
        Transaction t4 = new Transaction(acc1, 50000, Transaction.MODE_WITHDRAW);
        Transaction t5 = new Transaction(acc1, 9000, Transaction.MODE_WITHDRAW);
        Transaction t6 = new Transaction(acc1, 17000, Transaction.MODE_WITHDRAW);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
    }
}

// In above case, Transaction of different objects can be multithreaded.
// But, Transactions on same object/account should be sequential/single-threaded.

// In order to make operations synchronized: you can make the methods SYNCHRONIZED