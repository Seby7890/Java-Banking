public class StudentAccount extends BankAccount {
    private final double maxDepositAmount;

    public StudentAccount(double balance, String accountNumber, double maxDepositAmount) {
        super(balance, accountNumber);
        this.maxDepositAmount = maxDepositAmount;
    }

    public double getMaxDepositAmount() {
        return maxDepositAmount;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= getBalance()) {
            setBalance(getBalance() - amount);
            System.out.println("Withdrawal successful!");
        } else {
            System.out.println("NOT enough money in your account!");
        }
    }

    @Override
    public void deposit(double amount) {
        if (amount <= maxDepositAmount) {
            setBalance(getBalance() + amount);
            System.out.println("Deposit successful!");
        } else {
            System.out.println("NOT authorized for this deposit!");
        }
    }

    @Override
    public String toString() {
        return "StudentAccount: " + "maxDepositAmount = " + this.maxDepositAmount + "; balance = " + this.getBalance() + "; accountNumber = " + this.getAccountNumber();
    }
}