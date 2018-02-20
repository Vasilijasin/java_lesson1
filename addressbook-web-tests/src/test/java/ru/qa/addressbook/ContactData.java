package ru.qa.addressbook;

public class ContactData {
    private final String firstName;
    private final String lastName;
    private final String address;
    private final String city;
    private final String phone;
    private final String email;

    public ContactData(String firstName, String lastName, String address, String city, String phone, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.phone = phone;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }
}
