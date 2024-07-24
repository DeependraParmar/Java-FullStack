package threading3;

public class Transaction extends Thread {
    public static final int MODE_WITHDRAW = 1;
    public static final int MODE_DEPOSIT = 2;

    private BankAccount act;
    private float amount;
    private int mode;

    public Transaction(BankAccount act, float amount, int mode){
        super();
        this.act = act;
        this.amount = amount;
        this.mode = mode;
    }

    @Override
    public void run() {
        if(this.mode == MODE_WITHDRAW){
            this.act.withdraw(amount);
        }
        else if(this.mode == MODE_DEPOSIT){
            this.act.deposit(amount);
        }
        else{
            System.out.println();
            System.out.println("Invalid Operation Request !!");
        }
    }
}
