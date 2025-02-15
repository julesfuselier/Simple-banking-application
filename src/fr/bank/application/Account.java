package fr.bank.application;

import java.time.LocalDate;

public class Account extends Customer{
    private int balance = 0;
    private String ID;
    private String Password;

    public Account(String name, String lastName, String email, String phone, String address, String city, LocalDate dateOfBirth, String ID, String Password) {
        super(name, lastName, email, phone, address, city, dateOfBirth);
        this.ID = ID;
        this.Password = Password;
    }

    //getter and setter for : Balance
    public int getBalance() {return balance;}
    public void setBalance(int balance) {this.balance = balance;}

    //getter and setter for : ID
    public String getID() {return ID;}
    public void setID(String ID) {this.ID = ID;}

    //getter and setter for : Password
    public String getPassword() {return Password;}
    public void setPassword(String password) {this.Password = password;}

    //METHODS


    //toString
    @Override
    public String toString() {return "Account[" + super.toString() + "balance=" + balance + ", ID=" + ID + ", Password=" + Password;}

}
