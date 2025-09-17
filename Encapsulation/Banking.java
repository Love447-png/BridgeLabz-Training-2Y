interface Loanable {
    double calculateLoanEligibility();
    String getLoanDetails();
}

abstract class BankAccount {
    private String accountNo;
    private String holder;
    private double balance;

    public BankAccount(String accountNo, String holder, double balance) {
        this.accountNo = accountNo;
        this.holder = holder;
        this.balance = balance;
    }

    public String getAccountNo() { return accountNo; }
    public String getHolder() { return holder; }
    public double getBalance() { return balance; }

    public void deposit(double amount) { balance += amount; }
    public void withdraw(double amount) { balance -= amount; }

    public abstract void displayAccountType();
}

class SavingsAccount extends BankAccount implements Loanable {
    public SavingsAccount(String no, String holder, double bal) {
        super(no, holder, bal);
    }

    @Override
    public void displayAccountType() {
        System.out.println("Savings Account");
    }

    @Override
    public double calculateLoanEligibility() { return getBalance() * 2; }

    @Override
    public String getLoanDetails() { return "Loan up to double of balance"; }
}

class CurrentAccount extends BankAccount {
    public CurrentAccount(String no, String holder, double bal) {
        super(no, holder, bal);
    }

    @Override
    public void displayAccountType() {
        System.out.println("Current Account");
    }
}
public class TestBank {
    public static void main(String[] args) {
        BankAccount b1 = new SavingsAccount("S101", "Neha", 30000);
        BankAccount b2 = new CurrentAccount("C201", "Ravi", 50000);

        BankAccount[] accounts = { b1, b2 };
        for (BankAccount b : accounts) {
            System.out.println("Holder: " + b.getHolder());
            b.displayAccountType();
            if (b instanceof Loanable l) {
                System.out.println("Loan Eligible: " + l.calculateLoanEligibility());
            }
            System.out.println();
        }
    }
}
