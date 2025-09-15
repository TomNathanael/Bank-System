package Management;

import Bank.Account;  // Imports the Account class to use account methods

// Class to manage transactions on bank accounts
public class BankManager {

    // Method to perform a transaction on the given account
    // Throws TransactionException if something goes wrong
    public static void performTransaction(Account account, TransactionType type, double amount) throws TransactionException { // Static Variable
        
        // If the transaction is a deposit
        if (type == TransactionType.DEPOSIT) {
            // deposit account for Tommy
            account.deposit(amount);  // Add money to the account
            System.out.println("Deposited £" + String.format("%.2f", amount) + " into Account. " + account);  // Print the amount to be deposited
        } 
        // If the transaction is a withdrawal
        else if (type == TransactionType.WITHDRAWAL) {
            // withdraw account for Johnny
            account.withdraw(amount);  // Take money from the account
            System.out.println("Withdrew £" + String.format("%.2f", amount) + " from Account. " + account);  // Print the amount to be withdrawn
        }
    }
}
