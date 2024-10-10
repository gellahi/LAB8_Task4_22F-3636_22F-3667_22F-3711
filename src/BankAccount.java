public class BankAccount {

    private double balance;


    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }


    public double accountBalance() {
        return balance;
    }


    public void withdraw(double amount) {

    }


    public void deposit(double amount) {

    }

    public static void main(String[] args) {

        BankAccount account = new BankAccount(500.0);


        System.out.println("Account Balance: $" + account.accountBalance());  // Output: Account Balance: $500.0
    }
}
