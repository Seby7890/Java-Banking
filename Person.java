public class Person {
    private String name;
    private BankAccount[] accountList = new BankAccount[5];
    private int numberOfAccounts = 0;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BankAccount[] getAccountList() {
        return accountList;
    }

    public void setAccountList(BankAccount[] accountList) {
        this.accountList = accountList;
    }

    public int getNumberOfAccounts() {
        return numberOfAccounts;
    }

    public void setNumberOfAccounts(int numberOfAccounts) {
        this.numberOfAccounts = numberOfAccounts;
    }

    public void addAccount(BankAccount account) {
        accountList[numberOfAccounts] = account;
        numberOfAccounts++;
    }

    public void listAccounts() {
        for (int i = 0; i < numberOfAccounts; i++) {
            String accountNumber = accountList[i].getAccountNumber();
            String balance = String.valueOf(accountList[i].getBalance());
            System.out.println("Account number is '" + accountNumber + "' & balance is: " + balance + ".");

            if (accountList[i] instanceof StudentAccount) {
                System.out.println("Account type is StudentAccount.");
            } else {
                System.out.println("Account type is SpendingAccount.");
            }
        }
    }

    public void deposit(double amount, String accountNumber) {
        int depositionAccountPosition = search(accountNumber);

        if (depositionAccountPosition != -1) {
            accountList[depositionAccountPosition].deposit(amount);
        } else {
            System.out.println("Account doesn't exist.");
        }
    }

    public void withdraw(double amount, String accountNumber) {
        int withdrawalAccountPosition = search(accountNumber);

        if (withdrawalAccountPosition != -1) {
            accountList[withdrawalAccountPosition].withdraw(amount);
        } else {
            System.out.println("Account doesn't exist.");
        }
    }

    public void checkAccountDetails(String accountNumber) {
        int withdrawalAccountPosition = search(accountNumber);

        if (withdrawalAccountPosition == -1) {
            System.out.println("This account number is NOT in the list.");
        } else {
            System.out.println(accountList[withdrawalAccountPosition].toString());
        }
    }

    private int search(String accountNumber) {
        for (int i = 0; i < numberOfAccounts; i++) {
            if (accountNumber.equals(accountList[i].getAccountNumber())) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        return "Person: " + "Name = " + name + "; numberOfAccounts = " + numberOfAccounts;
    }
}