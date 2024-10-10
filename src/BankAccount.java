public class BankAccount {

    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Method from Member 1
    public double accountBalance() {
        return balance;
    }

    // Method from Member 2
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    // Method from Member 3
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public static void main(String[] args) {
        // Test the BankAccount class
        BankAccount account = new BankAccount(100.0);
        account.deposit(50.0);
        System.out.println("Balance after deposit: " + account.accountBalance()); // Should show 150.0
        account.withdraw(30.0);
        System.out.println("Balance after withdrawal: " + account.accountBalance()); // Should show 120.0
        account.deposit(-20.0);
    }
}
