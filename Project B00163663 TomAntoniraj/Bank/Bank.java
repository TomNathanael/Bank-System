package Bank; 

import Customer.Customer; // Imports the Customer class to represent bank customers
import java.util.ArrayList; // Imports ArrayList to store customers
import java.util.List; // Imports List interface for managing a list of customers

// Class representing a bank that manages customers
public class Bank {
    // Instance Variable
    private String name;  // store the bank name
    // Assosiaction <Customer>
    private List<Customer> customers = new ArrayList<>();  // List to hold the bank's customers

    // Constructor to initialize the bank with a given name
    public Bank(String name) {
        this.name = name;  
    }

    // Getter method to retrieve the bank's name
    public String getName() {
        return name;
    }

    // Setter method to update the bank's name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for the list of customers
    public List<Customer> getCustomers() { // Assosiaction <Customer>
        return customers;
    }

    // Setter method to set a new list of customers
    public void setCustomers(List<Customer> customers) { // Assosiaction <Customer>
        this.customers = customers;
    }

    // Method to add a new customer to the banks customer list
    public void addCustomer(Customer customer) {
        customers.add(customer);  // Adds the given customer to the ArrayList
    }

    // Method to display all customers and their account details
    public void displayCustomers() {
        for (int i = 0; i < customers.size(); i++) {  // Loop through each customer in the list
            System.out.println(customers.get(i));  // Access and print each customer
        }
    }
}