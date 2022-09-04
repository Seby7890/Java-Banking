public class SpendingAccount extends BankAccount {
    private double maxWithdrawalAmount;

    public SpendingAccount(double balance, String accountNumber, double maxWithdrawalAmount) {
        super(balance, accountNumber);
        this.maxWithdrawalAmount = maxWithdrawalAmount;
    }

    public double getMaxWithdrawalAmount() {
        return maxWithdrawalAmount;
    }

    public void setMaxWithdrawalAmount(double maxWithdrawalAmount) {
        this.maxWithdrawalAmount = maxWithdrawalAmount;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= (getBalance() + maxWithdrawalAmount)) {
            setBalance(getBalance() - amount);
            System.out.println("Withdrawal successful!");
        } else {
            System.out.println("NOT authorized to withdraw this amount!");
        }
    }

    @Override
    public void deposit(double amount) {
        setBalance(getBalance() + amount);
        System.out.println("Deposit successful!");
    }

    @Override
    public String toString() {
        return "SpendingAccount: " + "maxWithdrawalAmount = " + this.maxWithdrawalAmount + "; balance = " + this.getBalance() + "; accountNumber = " + this.getAccountNumber();
    }
}