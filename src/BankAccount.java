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

    }

    public static void main(String[] args) {

    }
}
