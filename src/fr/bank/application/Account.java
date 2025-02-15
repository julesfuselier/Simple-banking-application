package fr.bank.application;

import java.time.LocalDate;

public class Account extends Customer{
    private int balance = 0;
    private String ID;
    private String mdp;

    public Account(String name, String lastName, String email, String phone, String address, String city, LocalDate dateOfBirth, String ID, String mdp) {
        super(name, lastName, email, phone, address, city, dateOfBirth);
        this.ID = ID;
        this.mdp = mdp;
    }


    public int getBalance() {return balance;}
    public void setBalance(int balance) {this.balance = balance;}

    public String getID() {return ID;}
    public void setID(String ID) {this.ID = ID;}

    public String getMdp() {return mdp;}
    public void setMdp(String mdp) {this.mdp = mdp;}

}
