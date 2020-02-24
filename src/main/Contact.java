package main;

import java.util.LinkedList;


public class Contact implements Comparable<Contact> {
    private LinkedList<Long> mobileNo;
    private String name;
    private String lastName;
    private Contact contact;
    private String email;

    public Contact(String name, String lastName, String email, LinkedList<Long> mobileNo) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.mobileNo = mobileNo;

    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LinkedList<Long> getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(LinkedList<Long> mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }


    public int compareTo(Contact contact) {
        return name.compareTo(contact.name);
    }

}
