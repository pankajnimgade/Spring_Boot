package com.external.db.jpa.external.db.contact;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Contact {

    @Id
    private String phoneNumber;
    private String emailAddress;
    private String address;

    public Contact() {
    }

    public Contact(String phoneNumber, String emailAddress, String address) {
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
