Create an abstract class called BankAccount
Attributes:
    balance
    accountNumber
Methods:
    withdraw - abstract method
    deposit - abstract method

Create a class called StudentAccount which extends BankAccount
Attributes:
    maxDepositAmount - it will not change the data value once it has been initialized
Methods:
    withdraw - can withdraw a maximum of how much money is in the account at the time of withdrawing
    deposit - maximum "maxDepositAmount" money can be deposited once

Create a class called SpendingAccount which extends BankAccount
Attributes:
    maxWithdrawalAmount - can change its value once it has been initialized
Methods:
    withdraw - can withdraw with a maximum of "maxWithdrawalAmount" more than is in the account at the time of withdrawal
    deposit - any amount of money can be deposited into the account

Create a class called Person
Attributes:
    firstName
    lastName
    accountList
    numberOfAccounts
Methods:
    addAccount - will give the possibility for people to add an account to the list of accounts
    listAccounts - will print the accountNumber together with the balance for each account in the list
    deposit - will add a certain amount of money to an account
    withdraw - will withdraw a certain amount of money from an account
    checkAccountDetails - will print all the details of a certain account

Create a class called Bank
Attributes:
    clients
    numberOfClients
Methods:
    isPersonAvailable - 
    addPerson - 
    searchPersonByName - 
    searchPersonByAccountNumber - 

Create a class called BankingApp. The class will only have the main() method, where a person will be instantiated and spoken. test the methods that the person can do (add account, deposit, etc.)
