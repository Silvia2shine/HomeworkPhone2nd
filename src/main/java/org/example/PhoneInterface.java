package org.example;

/**
 * This is a interface. It promises 6 methods.
 */
public interface PhoneInterface {
    void addContact(String name, String phoneNumber);
    Contact getContact(int index);
    void sendMessage(String phoneNumber, String message);
    public void getMessage(String phoneNumber);
//
    public void call(String phoneNumber);
   public void viewHistory();



}
