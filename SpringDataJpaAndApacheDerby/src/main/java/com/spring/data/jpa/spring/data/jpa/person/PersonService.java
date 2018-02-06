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
/*        personRepository.save(
                new Person("1", "first Name", "last Name",
                        "603-525-1124", "kiba@inuyasha.com", "Ahmrest, NH"));*/
        List<Person> personList = new ArrayList<>();
        personRepository.findAll().forEach(personList::add);
        return personList;
//        return (List<Person>) personRepository.findAll();
    }

    public void addPerson(Person person) {
        personRepository.save(person);
    }

    public Person getPerson(String id) {
        return personRepository.findOne(id);
    }

    public void updatePerson(String id, Person person) {
        personRepository.save(person);
    }

    public void deletePerson(String id) {
        if (personRepository.exists(id)) {
            personRepository.delete(id);
        }
    }
}
