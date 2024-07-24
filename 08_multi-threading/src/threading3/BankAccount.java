package threading3;

public class BankAccount {
    private int acc_no;
    private float balance;

    public BankAccount(int acc_no, float balance){
        this.acc_no = acc_no;
        this.balance = balance;
    }

    public void deposit(float amount){
        float balance = this.balance;
        this.balance += amount;

        System.out.println("Deposit Successful...");
        System.out.println("Old Balance:  ₹" + balance);
        System.out.println("New Balance:  ₹" + this.balance);
    }

    public void withdraw(float amount){
        if(this.balance >= amount){
            float balance = this.balance;
            this.balance -= amount;

            System.out.println("Withdraw Successful...");
            System.out.println("Old Balance:  ₹" + balance);
            System.out.println("New Balance:  ₹" + this.balance);
        }
        else{
            System.out.println("Insufficient balance! : ₹" + this.balance);
        }
    }
}
