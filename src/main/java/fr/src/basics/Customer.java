package fr.src.basics;

public class Customer {

    private String firstName;
    private String lastName;
    private int age;
    private char gender; // 'm' or 'f'
    private String nationality;

    public Customer(String firstName, String lastName, int age, char gender, String nationality)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.nationality = nationality;

    }

    // Setters

    public void setFirstName(String newFirstName) { this.firstName = newFirstName; }

    public void setLastName(String newLastName) { this.lastName = newLastName; }

    public void setAge(int newAge) { this.age = newAge; }

    public void setGender(char newGender) { this.gender = newGender; }

    public void setNationality( String newNationality) { this.nationality = newNationality; }

    // Getters

    public String getFirstName() { return firstName; }

    public String getLastName() { return lastName; }

    public int getAge() { return age; }

    public char getGender() { return gender; }

    public String getNationality() { return nationality; }

    public String toString() {
        return "Customer [ " + firstName + " " + lastName + " " + age + " " + gender + " " + nationality + " ] ";
    }

}


