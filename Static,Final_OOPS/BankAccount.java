public class BankAccount {
    private String accountHolderName;
    private final String accountNumber;
    private double balance;

    private static String bankName = "State Bank";
    private static int totalAccounts = 0;

    public BankAccount(String accountHolderName, String accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;         
        this.balance = balance;
        totalAccounts++;
    }

    public void displayDetails() {
        if (this instanceof BankAccount) {
            System.out.println("Bank: " + bankName);
            System.out.println("Holder: " + accountHolderName);
            System.out.println("Account No: " + accountNumber);
            System.out.println("Balance: " + balance);
        }
    }

    public static void getTotalAccounts() {
        System.out.println("Total accounts: " + totalAccounts);
    }

    public static void main(String[] args) {
        BankAccount a1 = new BankAccount("Asha", "AC101", 5000);
        BankAccount a2 = new BankAccount("Rahul", "AC102", 7000);

        a1.displayDetails();
        System.out.println();
        a2.displayDetails();
        BankAccount.getTotalAccounts();
    }
}
