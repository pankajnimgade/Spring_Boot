package com.spring.data.jpa.spring.data.jpa.person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonContoller {

    @Autowired
    private PersonService personService;

    @RequestMapping("/persons")
    public List<Person> getAllPersons() {
        return personService.getAllPersons();
    }

    @RequestMapping(value = "/persons", method = RequestMethod.POST)
    public void addPerson(@RequestBody Person person) {
        personService.addPerson(person);
    }

    @RequestMapping(value = "/persons/{id}")
    public Person getPerson(@PathVariable String id) {
        return personService.getPerson(id);
    }

    @RequestMapping(value = "/persons/{id}", method = RequestMethod.PUT)
    public void updatePerson(@PathVariable String id,@RequestBody Person person) {
        personService.updatePerson(id, person);
    }

    @RequestMapping(value = "/persons/{id}", method = RequestMethod.DELETE)
    public void deletePerson(@PathVariable String id) {
        personService.deletePerson(id);
    }
}
