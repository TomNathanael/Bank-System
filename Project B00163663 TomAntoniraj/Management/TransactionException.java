package Management;

// Custom exception to handle transaction errors such as insufficient funds or invalid operations
public class TransactionException extends Exception{

    // Constructor that takes a transaction error message 
    public TransactionException(String message) {
        super(message);  // Calls the superclass constructor with the provided message
    }
}
