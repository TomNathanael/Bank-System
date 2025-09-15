package Customer; 

import Bank.Account;  // Imports the Account class 

// Class representing a customer with a name and a bank account
public class Customer { 
    // Instance Variable
    private String name;  // Field to store the customer's name
    private Account account;  // Field to store the customer's associated bank account

    // Constructor to initialize the customer with a name and an account
    public Customer(String name, Account account) {
        this.name = name;  // Initialize name
        this.account = account;  // Initialize account
    }

    // Getter method for the customers name
    public String getName() {
        return name;  // Returns the customers name
    }

    // Setter method for the customer's name
    public void setName(String name) {
        this.name = name;  // Updates the customers name
    }

    // Getter method for the customer's account
    public Account getAccount() {
        return account;  // Returns the customers account object
    }

    // Setter method for the customer's account
    public void setAccount(Account account) {
        this.account = account;  // Updates the customers account
    }

    // Overridden toString method to provide a string representation of the customer
    @Override
    public String toString() {
        return "Customer: " + name + ", " + account;  // Returns formatted customer details
    }
}