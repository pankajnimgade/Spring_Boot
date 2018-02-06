package com.spring.data.jpa.spring.data.jpa.person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonContoller {

    @Autowired
    private PersonService personService;

    @RequestMapping("/persons")
    public List<Person> getAllPersons(){
        return personService.getAllPersons();
    }

    @RequestMapping(value = "/persons", method = RequestMethod.POST)
    public void addPerson(@RequestBody Person person){
        personService.addPerson(person);
    }

}
