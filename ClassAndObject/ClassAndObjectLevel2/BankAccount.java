import java.util.Scanner;
public class BankAccount {
    private String accountHolder;
    private String accountNumber;
    private double balance;

    public BankAccount(String holder, String number, double initialBalance) {
        this.accountHolder = holder;
        this.accountNumber = number;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit.");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        }
    }

    public void displayBalance() {
        System.out.printf("Account: %s (%s)\nBalance: %.2f\n",
                accountHolder, accountNumber, balance);
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount("Priya", "AC12345", 2000.00);
        Scanner sc = new Scanner(System.in);

        acc.displayBalance();
        System.out.print("\nEnter deposit amount: ");
        acc.deposit(sc.nextDouble());
        acc.displayBalance();

        System.out.print("\nEnter withdrawal amount: ");
        acc.withdraw(sc.nextDouble());
        acc.displayBalance();

        sc.close();
    }
}
