package com.external.db.jpa.external.db.contact;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ContactService {

    @Autowired
    private ContactRepository contactRepository;

    public List<Contact> getAllContacts(String employeeId) {

        //TODO : Need to get only contacts related to the employeeID
        List<Contact> contactList = new ArrayList<>();
        contactRepository.findByEmployeeId(employeeId).forEach(contact -> contactList.add(contact));
        return contactList;
    }

    public Contact getContact(String phoneNumber) {
        return contactRepository.findOne(phoneNumber);
    }

    public Contact addContact(Contact contact) {
        return contactRepository.save(contact);
    }

    public Contact updateContact(Contact contact) {
        return contactRepository.save(contact);
    }

    public boolean deleteContact(String phoneNumber) {
        if (contactRepository.exists(phoneNumber)) {
            contactRepository.delete(phoneNumber);
            return true;
        }
        return false;
    }
}
