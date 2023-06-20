package basicjava.bankmangement;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class Bank {

    private String bankName;
    private List<Customer> customers;

    public Bank(String bankName) {
        this.bankName = bankName;
        this.customers = new ArrayList<>();
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void displayCustomers() {
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }

    public void saveCustomersToFile(String fileName) {
        try ( BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (Customer customer : customers) {
                writer.write(customer.toString());
                writer.newLine();
            }
            System.out.println("Customers saved to file successfully.");
        } catch (IOException e) {
            System.out.println("Error occurred while saving customers to file.");
        }
    }
}
