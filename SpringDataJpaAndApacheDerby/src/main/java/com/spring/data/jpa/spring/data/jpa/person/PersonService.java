package com.spring.data.jpa.spring.data.jpa.person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;


    public List<Person> getAllPersons() {
        List<Person> personList = new ArrayList<>();
        personRepository.save(
                new Person("1", "first Name", "last Name",
                        "603-525-1124", "kiba@inuyasha.com", "Ahmrest, NH"));
        personRepository.findAll().forEach(personList::add);
        return personList;
//        return (List<Person>) personRepository.findAll();
    }

    public void addPerson(Person person) {
        personRepository.save(person);
    }
}
