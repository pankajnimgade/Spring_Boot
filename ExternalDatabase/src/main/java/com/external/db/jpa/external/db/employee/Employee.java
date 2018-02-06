package com.external.db.jpa.external.db.employee;

import com.external.db.jpa.external.db.contact.Contact;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {

    @Id
    private String employeeId;
    private String firsName;
    private String lastName;
    private Contact contact;

    public Employee() {
    }

    public Employee(String employeeId, String firsName, String lastName, Contact contact) {
        this.employeeId = employeeId;
        this.firsName = firsName;
        this.lastName = lastName;
        this.contact = contact;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getFirsName() {
        return firsName;
    }

    public void setFirsName(String firsName) {
        this.firsName = firsName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }
}
