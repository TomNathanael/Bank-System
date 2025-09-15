package Customer;

import Bank.Account; // Imports the Account class
import Management.TransactionException; // Import the custom exception class

public class CheckingAccount extends Account { // Inheritance

    // Constant defining the minimum balance that must be maintained in the account
    // Static Variable
    private static double MINIMUM_BALANCE = 10.00;  // Error occurs if balance goes below this amount

    // Constructor to initialize the CheckingAccount with an account number and initial balance
    public CheckingAccount(String accountNumber, double balance) {
        super(accountNumber, balance);  // Calls the constructor of the superclass
    }
 
    // Method to deposit a specified amount into the account
    @Override
    public void deposit(double amount) {
        balance += amount;  // Adds the deposit amount to the current balance
    }

    // Method to withdraw a specified amount from the account
    @Override
    public void withdraw(double amount) throws TransactionException {
        // Check if the remaining balance after withdrawal is below the minimum balance
        if (balance - amount < MINIMUM_BALANCE) {
            // If true, throw a TransactionException with an error message
            throw new TransactionException("Withdrawal denied! Balance Must Remain Above £" + MINIMUM_BALANCE);
        }
        balance -= amount;  // Deducts the amount from the balance if it's above the minimum
    }

    // Method to return a string representation of the account details
    @Override
    public String toString() {
        // Calls the superclass's toString method and adds minimum balance info
        return super.toString() + ", Minimum Balance: £" + MINIMUM_BALANCE;
    }
}
