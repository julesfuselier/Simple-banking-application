package fr.src.basics;

public class BankAccount extends Customer{
    private double balance;
    private int accountNumber;
    Customer customer;

    public BankAccount(double balance, int accountNumber, Customer customer, String firstName, String lastName, int age, char gender, String nationality) {
        super(firstName, lastName, age, gender, nationality);
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public int getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public Customer getCustomer() {
        return customer;
    }
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    public void deposit(double amount) {
        balance += amount;
    }
    public void withdraw(double amount) {
        balance -= amount;
    }

    public String toString() {
        return "Bank Account [ " + super.toString() + "\nBalance: " + balance + "\nAccount number: " + accountNumber + " ] ";
    }
}
