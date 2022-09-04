Create an abstract class called BankAccount
- Attributes:
	- balance
	- accountNumber
- Methods:
	- withdraw - abstract method
	- deposit - abstract method

Create a class called StudentAccount which extends BankAccount
- Attributes:
	- maxDepositAmount - it will not change the data value once it has been initialized
- Methods:
	- withdraw - can withdraw a maximum of how much money is in the account at the time of withdrawal
	- deposit - maximum money that can be deposited once

Create a class called SpendingAccount which extends BankAccount
- Attributes:
	- maxWithdrawalAmount - can change its value once it has been initialized
- Methods:
	- withdraw - can withdraw with a maximum of "maxWithdrawalAmount" more than is in the account at the time of withdrawal
	- deposit - any amount of money can be deposited into the account

Create a class called Person
- Attributes:
	- name
	- accountList
	- numberOfAccounts
- Methods:
	- addAccount - will give the possibility for people to add an account to the list of accounts
	- listAccounts - will print the accountNumber together with the balance for each account in the list
	- deposit - will add a certain amount of money to an account
	- withdraw - will withdraw a certain amount of money from an account
	- checkAccountDetails - will print all the details of a certain account

Tips: The methods deposit, withdraw and checkAccountDetails will have to search for an account number in a list of accounts, so a private method can be created.

Create a class called Bank
- Attributes:
	- clients
	- numberOfClients
- Methods:
	- isPersonAvailable - checks if a person is already on the bank or not
	- addPerson - adds a new person in the bank if this person is not already in the list
	- searchPersonByName - searches for a person by it's name
	- searchPersonByAccountNumber - searches for a person by it's account number

Create a class called BankingApp. The class will have the main method, where a list of clients will be created and a new bank.
- Methods:
	- printMenu
- MENU:
 - "1. Create new account"
 - "2. Deposit money in a specific account"
 - "3. Withdraw money from a specific account"
 - "4. Check account details"
 - "5. EXIT!"
 - "----------------------------------------------- ----------------- ”
 - "Choose option: "