package fr.bank.application;
import java.time.LocalDate;

public class Customer {

    private String name;
    private String lastName;
    private String email;
    private String phone;
    private String address;
    private String city;
    private LocalDate dateOfBirth;

    public Customer(String name, String lastName, String email, String phone, String address, String city, LocalDate dateOfBirth) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.city = city;
        this.dateOfBirth = dateOfBirth;
    }

    // getter and setter for : name
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    // getter and setter for : lastName
    public String getLastName() {return lastName;}
    public void setLastName(String lastName) {this.lastName = lastName;}

    // getter and setter for : email
    public String getEmail() {return email;}
    public void setEmail(String email) {this.email = email;}

    // getter and setter for : phone
    public String getPhone() {return phone;}
    public void setPhone(String phone) {this.phone = phone;}

    // getter and setter for : address
    public String getAddress() {return address;}
    public void setAddress(String address) {this.address = address;}

    // getter and setter for : city
    public String getCity() {return city;}
    public void setCity(String city) {this.city = city;}

    // getter and setter for : dateOfBirth
    public LocalDate getDateOfBirth() {return dateOfBirth;}
    public void setDateOfBirth(LocalDate dateOfBirth) {this.dateOfBirth = dateOfBirth;}

    // METHODS

    // to verify if the customer is an adult or no
    public boolean isAdult(LocalDate date) {
        LocalDate today = LocalDate.now();
        return date.plusYears(18).isBefore(today) || date.plusYears(18).isEqual(today);
    }

    // to get the age of the customer with his date of birth
    public int Age(LocalDate date) {
        LocalDate today = LocalDate.now();
        return date.compareTo(today);
    }



//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Customer customer = (Customer) o;
//        return name.equals(customer.name);
//    }

    // toString()

    public String toString() {
        return "Customer [name=" + name + ", lastName=" + lastName + ", email=" + email + ", phone=" + phone + ", address=" + address + ", city=" + city + ", dateOfBirth=" + dateOfBirth + "]";
    }



}
