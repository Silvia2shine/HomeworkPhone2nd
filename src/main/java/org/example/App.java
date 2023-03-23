package org.example;

/**
 * This is a class that contains the main method. It has o object of the class SamsungGalaxy6.
 * There are call the addContact, sendMessage, getMessage, call and view history methods.
 *
 * @param : - phone - an object of the SamsungGalaxy6 class.
 */

public class App {
    public static void main(String[] args) {


        Phone phone = new SamsungGalaxy6(45, "red", "plastic", 5678d);


        phone.addContact("Silvia", "0745359497");
        phone.addContact("Bogdan", "0728291607");

        System.out.println(phone.getContact(0));
        System.out.println(phone.getContact(1));


        phone.sendMessage("0745359497", "Ana are mere");
        phone.sendMessage("0745359497", "Ana are pere");

        phone.sendMessage("0728291607", "Bogdi are mere");
        phone.sendMessage("0728291607", "Bogdi are pere");

        phone.getMessage("0745359497");
        phone.getMessage("0728291607");


        phone.call("0745123456");
        phone.call("0745654321");
        phone.call("0745123456");


        phone.viewHistory();
    }
}
