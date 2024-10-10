public class BankAccount {

    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public double accountBalance() {
        return balance;
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds. Withdrawal denied.");
        } else {
            balance -= amount;
            System.out.println("Withdrew: " + amount + ", New Balance: " + balance);
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount + ", New Balance: " + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount(100.0);
        account.deposit(50.0);
        System.out.println("Balance after deposit: " + account.accountBalance()); // Should show 150.0
        account.withdraw(30.0);
        System.out.println("Balance after withdrawal: " + account.accountBalance()); // Should show 120.0
        account.deposit(-20.0); // Should show error message
    }
}
