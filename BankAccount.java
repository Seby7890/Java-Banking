public abstract class BankAccount {
    private double balance;
    private String accountNumber;

    public BankAccount(double balance, String accountNumber) {
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public abstract void withdraw(double amount);

    public abstract void deposit(double amount);

    @Override
    public String toString() {
        return "BankAccount: " + "balance = " + this.balance + "; accountNumber = " + this.accountNumber;
    }
}