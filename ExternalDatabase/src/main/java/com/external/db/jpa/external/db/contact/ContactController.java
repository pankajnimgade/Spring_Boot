package com.external.db.jpa.external.db.contact;

import com.external.db.jpa.external.db.employee.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ContactController {

    @Autowired
    private ContactService contactService;

    @RequestMapping(value = "/employees/{employeeId}/contacts", method = RequestMethod.GET)
    public List<Contact> getAllContacts(@PathVariable String employeeId) {
        return contactService.getAllContacts(employeeId);// not Done
    }

    @RequestMapping(value = "/employees/{employeeId}/contacts/{phoneNumber}", method = RequestMethod.GET)
    public Contact getContact(@PathVariable String employeeId, @PathVariable String phoneNumber) {
        return contactService.getContact(phoneNumber);//Done
    }

    @RequestMapping(value = "/employees/{employeeId}/contacts", method = RequestMethod.POST)
    public Contact addContact(@PathVariable String employeeId, @RequestBody Contact contact) {
        contact.setEmployee(new Employee(employeeId, "", ""));
        return contactService.addContact(contact);//Done
    }

    @RequestMapping(value = "/employees/{employeeId}/contacts/{phoneNumber}", method = RequestMethod.PUT)
    public Contact updateContact(@PathVariable String employeeId, @RequestBody Contact contact) {
        contact.setEmployee(new Employee(employeeId,"",""));
        return contactService.updateContact(contact);
    }

    @RequestMapping(value = "/employees/{employeeId}/contacts/{phoneNumber}", method = RequestMethod.DELETE)
    public boolean deleteContact(@PathVariable String phoneNumber) {
        return contactService.deleteContact(phoneNumber);
    }
}
