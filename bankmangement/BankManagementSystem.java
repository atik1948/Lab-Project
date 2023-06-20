package basicjava.bankmangement;

public class BankManagementSystem {

    public static void main(String[] args) {
        Bank bank = new Bank("MyBank");

        // Create customers
        Customer customer1 = new Customer("Abdul", 30);
        Customer customer2 = new Customer("Wahid", 25);

        // Create accounts
        Account account1 = new Account("1001", 1000.0);
        Account account2 = new Account("1002", 500.0);
        Account account3 = new Account("1003", 2000.0);

        // Add accounts to customers
        customer1.addAccount(account1);
        customer1.addAccount(account2);
        customer2.addAccount(account3);

        // Add customers to the bank
        bank.addCustomer(customer1);
        bank.addCustomer(customer2);

        // Display customers and their accounts
        bank.displayCustomers();

        // Perform calculations
        account1.deposit(500.0);
        account2.withdraw(200.0);
        double balance = account3.getBalance();
        System.out.println("Account 3 Balance: " + balance);

        // Save customers to a file
        bank.saveCustomersToFile("customers.txt");
    }
}
