class ATM {
    double balance;

    ATM(double b){
        balance=b;
    }

    void deposit(double amt){
        balance+=amt;
        System.out.println("Deposited: "+amt);
    }

    void withdraw(double amt){
        if(amt<=balance){
            balance-=amt;
            System.out.println("Withdrawn: "+amt);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    void checkBalance(){
        System.out.println("Balance: "+balance);
    }
}

public class ATMMain {
    public static void main(String[] args){
        ATM a1=new ATM(10000);
        a1.checkBalance();
        a1.deposit(2000);
        a1.withdraw(5000);
        a1.checkBalance();
    }
}
