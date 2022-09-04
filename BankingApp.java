import java.util.Scanner;

public class BankingApp {
    public static void main(String[] args) {
        Person[] clients = new Person[5];
        Bank bank = new Bank(clients);
        Scanner console = new Scanner(System.in);
        int option;

        do {
            printMenu();
            option = console.nextInt();
            performSelectedAction(bank, console, option);
        } while (option != 5);
    }

    public static void printMenu() {
        System.out.println("MENU:");
        System.out.println("1. Create new account");
        System.out.println("2. Deposit money in a specific account");
        System.out.println("3. Withdraw money from a specific account");
        System.out.println("4. Check account details");
        System.out.println("5. EXIT!");
        System.out.println("--------------------------------------------");
        System.out.print("Choose option: ");
    }

    public static void performSelectedAction(Bank bank, Scanner console, int option) {
        switch (option) {
            case 1 -> addNewAccount(bank, console);
            case 2 -> depositMoney(bank, console);
            case 3 -> withdrawMoney(bank, console);
            case 4 -> checkAccount(bank, console);
            case 5 -> System.out.println("See you next time!");
            default -> System.out.println("Invalid option! Try again...");
        }
    }

    public static void addNewAccount(Bank bank, Scanner console) {
        System.out.print("Enter name: ");
        String name = console.next();

        if (bank.searchPersonByName(name) == null) {
            Person person = new Person(name);
            System.out.println("Choose account type: ");
            System.out.println("1: Student Account");
            System.out.println("2: Spending Account");
            System.out.print("Enter option: ");
            int accountType = console.nextInt();

            while (accountType != 1 && accountType != 2) {
                System.out.println("Invalid account. Please try again...");
                accountType = console.nextInt();
            }

            System.out.print("Enter account number: ");
            String accountNumber = console.next();
            System.out.print("Enter account balance: ");
            double balance = console.nextDouble();

            if (accountType == 1) {
                System.out.print("Enter max deposit amount: ");
                double depositAmount = console.nextDouble();
                StudentAccount studentAccount = new StudentAccount(balance, accountNumber, depositAmount);
                person.addAccount(studentAccount);
            } else {
                System.out.print("Enter max withdrawal amount: ");
                double withdrawalAmount = console.nextDouble();
                SpendingAccount spendingAccount = new SpendingAccount(balance, accountNumber, withdrawalAmount);
                person.addAccount(spendingAccount);
            }

            bank.addPerson(person);
            person.listAccounts();
        }
    }

    public static void depositMoney(Bank bank, Scanner console) {
        System.out.print("Select account number: ");
        String accountNumber = console.next();
        Person person = bank.searchPersonByAccountNumber(accountNumber);

        if (person != null) {
            System.out.print("Enter amount: ");
            double amount = console.nextDouble();
            person.deposit(amount, accountNumber);
        } else {
            System.out.println("Account number doesn't exist!");
        }
    }

    public static void withdrawMoney(Bank bank, Scanner console) {
        System.out.print("Select account number: ");
        String accountNumber = console.next();
        Person person = bank.searchPersonByAccountNumber(accountNumber);

        if (person != null) {
            System.out.print("Enter amount: ");
            double amount = console.nextDouble();
            person.withdraw(amount, accountNumber);
        } else {
            System.out.println("Account number doesn't exist!");
        }
    }

    public static void checkAccount(Bank bank, Scanner console) {
        System.out.print("Select account number: ");
        String account = console.next();
        Person person = bank.searchPersonByAccountNumber(account);

        if (person != null) {
            person.checkAccountDetails(account);
        } else {
            System.out.println("Account number doesn't exist!");
        }
    }
}