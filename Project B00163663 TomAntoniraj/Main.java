// Import the necessary classes that will be used in the program
import Bank.Bank;
import Customer.Customer; 
import Customer.SavingsAccount; 
import Management.BankManager;
import Management.TransactionException;
import Management.TransactionType;
import Customer.CheckingAccount; 

public class Main {
    public static void main(String[] args) {
        // Create a new bank named "Revolut Accounts"
        Bank customerBank = new Bank("Revolut Accounts");

        // Create a SavingsAccount with an initial balance of 2200
        SavingsAccount savings = new SavingsAccount("'REVS13259827'", 2200);
        
        // Create a CheckingAccount with an initial balance of 700
        CheckingAccount checking = new CheckingAccount("'REVC10294564'", 700);

        // Create customers Tommy and Johnny and link them to their respective accounts
        Customer Tommy = new Customer("'Tommy'", savings);
        Customer Johnny = new Customer("'Johnny'", checking);

        // Add both customers to the bank
        customerBank.addCustomer(Tommy);
        customerBank.addCustomer(Johnny);

        // Display the two customers and their account information
        customerBank.displayCustomers();

        try {
            // Deposit 500 into Tommy's SavingsAccount
            BankManager.performTransaction(savings, TransactionType.DEPOSIT, 500);

            // Withdraw 255 from Johnny's CheckingAccount
            BankManager.performTransaction(checking, TransactionType.WITHDRAWAL, 255);

            // Print updated account details after transactions
            System.out.println("\nAfter Transactions:");
            customerBank.displayCustomers(); // Customers details with their bank account numbers
        } catch (TransactionException e) {
            // Handle any exceptions thrown during the transactions (e.g insufficient funds)
            System.out.println("Transaction Error: " + e.getMessage());
        }
    }
}