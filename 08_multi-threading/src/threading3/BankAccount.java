package threading3;

public class BankAccount {
    private int acc_no;
    private float balance;

    public BankAccount(int acc_no, float balance){
        this.acc_no = acc_no;
        this.balance = balance;
    }

    public synchronized void deposit(float amount){
        float balance = this.balance;
        this.balance += amount;

        System.out.println("Deposit Successful..." + " | Amount: " + amount + " | Old Balance:  ₹" + balance + " | New Balance:  ₹" + this.balance);
    }

    public synchronized void withdraw(float amount){
        if(this.balance >= amount){
            float balance = this.balance;
            this.balance -= amount;

            System.out.println("Withdraw Successful..." + " | Amount: " + amount + " | Old Balance:  ₹" + balance + " | New Balance:  ₹" + this.balance);
        }
        else{
            System.out.println("Insufficient balance! : ₹" + this.balance);
        }
    }
}
