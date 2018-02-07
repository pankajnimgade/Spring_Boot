package com.external.db.jpa.external.db.contact;

import com.external.db.jpa.external.db.employee.Employee;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Contact {

    @Id
    private String phoneNumber;
    private String emailAddress;
    private String address;

    // this would tie the Contact Object to an instance of Employee
    @ManyToOne
    private Employee employee;

    public Contact() {
    }

    public Contact(String phoneNumber, String emailAddress, String address, String employeeId) {
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
        this.address = address;
        this.employee = new Employee(employeeId, "", "");
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

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
