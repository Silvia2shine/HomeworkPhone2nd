package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * This is a class that implements the  PhoneInterface. It contains the methods that are define in the interface.
 *
 * @param : -  protected final Integer batteryLife;
 * @param : -  List<Contact> contact = new ArrayList<>();
 * @param : - Map<String, List<String>> messages = new HashMap<>();
 * @param : - List<String> calls =new ArrayList<>();
 * @param : - Integer battery ;
 */
abstract class Phone implements PhoneInterface {
    protected final Integer batteryLife;
    List<Contact> contact = new ArrayList<>();
    Map<String, List<String>> messages = new HashMap<>();
    List<String> calls = new ArrayList<>();
    Integer battery;

    /**
     * This is the constructor of the class Phone.
     *
     * @param : -  batteryLife;
     */
    Phone(Integer batteryLife) {

        this.batteryLife = batteryLife;
        battery = batteryLife;

    }

    /**
     * This is a method that add a contact to the list.
     *
     * @param : -  name;
     * @param : - phoneNumber;
     */
    @Override
    public void addContact(String name, String phoneNumber) {
        Contact personFromList = new Contact(name, phoneNumber);
        contact.add(personFromList);
        System.out.println(personFromList);

    }

    /**
     * This is a method that get a contact from the list.
     *
     * @param : -  index;
     */
    public Contact getContact(int index) {
        if (index >= 0 && index < contact.size()) {
            contact.get(index);
        } else {
            System.out.println("Index out of range ");
        }
        return contact.get(index);
    }

    /**
     * This is a method that return the phone number.
     *
     * @param : -i- the index;
     */
    public String getNumber(int i) {
        ;
        return contact.get(i).phoneNumber;
    }

    /**
     * This is a method that put the message in a HashMap.
     *
     * @param : - phoneNumber;
     * @param : - message;
     */
    public void sendMessage(String phoneNumber, String message) {
        if (message.length() <= 500) {
            for (int i = 0; i < contact.size(); i++) {
                if (getNumber(i) == phoneNumber) {
                    if (!messages.containsKey(phoneNumber)) {
                        messages.put(phoneNumber, new ArrayList<>());
                    }
                    messages.get(phoneNumber).add(message);
                    System.out.println("Message " + "'" + message + "'"
                            + " is sent to phone number " + phoneNumber);

                    battery -= 1;
                }
            }
        } else {
            System.out.println("The message is to long, it can't be sent");
        }
    }
    /**
     * This is a method that get the message from the HashMap.
     *
     * @param : - phoneNumber;
     */
    public void getMessage(String phoneNumber) {

        if (messages.containsKey(phoneNumber)) {
            System.out.println("Messages for " + phoneNumber + ":");
            for (String message1 : messages.get(phoneNumber)) {
                System.out.println(message1);
            }
        } else {
            System.out.println("No messages found for " + phoneNumber + ".");
        }
    }
    /**
     * This is a method that put the phoneNumber in a List.
     *
     * @param : - phoneNumber;
     */
    public void call(String phoneNumber) {
        calls.add(phoneNumber);
        System.out.println("The phone has made a call to phone number " + phoneNumber);
        battery -= 2;
    }
    /**
     * This is a method that list the elements from a list of numbers.

     */
    public void viewHistory() {
        System.out.println("The history of calls is: " + calls);
    }
}













