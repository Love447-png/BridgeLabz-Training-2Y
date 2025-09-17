class Customer {
    String name;
    double balance;

    public Customer(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public void viewBalance() {
        System.out.println(name + " → Balance: " + balance);
    }
}

class Bank {
    String bankName;

    public Bank(String bankName) {
        this.bankName = bankName;
    }

    public void openAccount(Customer c) {
        System.out.println(c.name + " opened account in " + bankName);
    }
}

public class TestBank {
    public static void main(String[] args) {
        Bank b = new Bank("SBI");
        Customer c1 = new Customer("Asha", 5000);
        Customer c2 = new Customer("Rahul", 7000);

        b.openAccount(c1);
        b.openAccount(c2);

        c1.viewBalance();
        c2.viewBalance();
    }
}
