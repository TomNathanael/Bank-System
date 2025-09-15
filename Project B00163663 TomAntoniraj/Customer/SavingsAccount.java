package Customer;

import Bank.Account;  // Imports the Account class, which SavingsAccount extends

public class SavingsAccount extends Account { // Inheritance

    // Constructor to initialize the SavingsAccount with an account number and initial balance
    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);  // Calls the constructor of the superclass account
    }

    // Method to deposit a specified amount into the savings account
    @Override
    public void deposit(double amount) {
        balance += amount;  // Adds the deposit amount to the current balance
    }

    // Method to withdraw a specified amount from the savings account
    @Override
    public void withdraw(double amount) {
        balance -= amount;  // Deducts the withdrawal amount from the balance if funds are sufficient
    }
}
