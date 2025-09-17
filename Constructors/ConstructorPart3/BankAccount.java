class BankAccount {
    public String accountNumber;
    protected String accountHolder;
    private double balance;

    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public double getBalance() { return balance; }
    public void deposit(double amt) { balance += amt; }
}

class SavingsAccount extends BankAccount {
    public SavingsAccount(String accNo, String holder, double bal) {
        super(accNo, holder, bal);
    }

    public void display() {
        System.out.println("Account: " + accountNumber +
                ", Holder: " + accountHolder + ", Balance: " + getBalance());
    }

    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("AC123", "Rahul", 5000);
        sa.display();
        sa.deposit(2000);
        sa.display();
    }
}
