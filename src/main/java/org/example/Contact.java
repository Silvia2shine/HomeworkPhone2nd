package org.example;

/**
 * This is a class of contacts.
 *
 * @param : -  name;
 * @param : -  phoneNumber;

 */
public class Contact {
    String name;
    String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Nume " + name + " "
                + "phone number " + phoneNumber;
    }
}
