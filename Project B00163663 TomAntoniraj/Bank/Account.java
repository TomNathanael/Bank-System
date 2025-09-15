package Bank;

import Management.TransactionException;  // Import the exception class

// Abstract class representing a generic bank account
public abstract class Account {
    // Protected fields to store the account number and balance, accessible by subclasses
    protected String accountNumber;  // Unique identifier for the account
    protected double balance;  // Current balance in the account

    // Constructor to initialize the account with an account number and initial balance
    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;  // Assigns the account number
        this.balance = balance;  // Sets the initial balance
    }

    // Abstract method for depositing money into the account, must be implemented by subclasses
    public abstract void deposit(double amount); // Method to deposit money into the account

    // Abstract method for withdrawing money from the account, must be implemented by subclasses
    // Throws TransactionException if an error occurs
    public abstract void withdraw(double amount) throws TransactionException; // Method to withdraw money from the account

    // Overridden toString method to provide a string representation of the account details
    @Override
    public String toString() {
        return "Account Number: " + accountNumber + ", Balance: £" + String.format("%.2f", balance);
    }
}