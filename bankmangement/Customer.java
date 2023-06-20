package basicjava.bankmangement;

import java.util.ArrayList;
import java.util.List;

class Customer {

    private String name;
    private int age;
    private List<Account> accounts;

    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void displayAccounts() {
        for (Account account : accounts) {
            System.out.println(account);
        }
    }

    @Override
    public String toString() {
        return "Customer: " + name + ", Age: " + age;
    }
}
