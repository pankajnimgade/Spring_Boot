package com.external.db.jpa.external.db.contact;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ContactRepository extends CrudRepository<Contact, String> {

    List<Contact> findByPhoneNumber(String phoneNumber);

    List<Contact> findByEmailAddress(String emailAddress);

    List<Contact> findByEmployeeId(String employeeId);
}
