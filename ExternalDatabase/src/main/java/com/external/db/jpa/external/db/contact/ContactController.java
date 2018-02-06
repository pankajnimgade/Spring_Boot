package com.external.db.jpa.external.db.contact;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ContactController {

    @Autowired
    private ContactService contactService;

    @RequestMapping(value = "/contacts", method = RequestMethod.GET)
    public List<Contact> getAllContacts() {
        return contactService.getAllContacts();
    }

    @RequestMapping(value = "/contacts/{phoneNumber}", method = RequestMethod.GET)
    public Contact getAllContacts(@PathVariable String phoneNumber) {
        return contactService.getContact(phoneNumber);
    }

    @RequestMapping(value = "/contacts", method = RequestMethod.POST)
    public Contact addContact(@RequestBody Contact contact){
        return contactService.addContact(contact);
    }

    @RequestMapping(value = "/contacts/{phoneNumber}", method = RequestMethod.PUT)
    public Contact updateContact(@PathVariable String phoneNumber, @RequestBody Contact contact){
        return contactService.updateContact(contact);
    }

    @RequestMapping(value = "/contacts/{phoneNumber}", method = RequestMethod.DELETE)
    public boolean deleteContact(@PathVariable String phoneNumber){
        return contactService.deleteContact(phoneNumber);
    }
}
