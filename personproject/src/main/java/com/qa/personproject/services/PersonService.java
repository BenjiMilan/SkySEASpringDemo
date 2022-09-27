package com.qa.personproject.services;

import com.qa.personproject.entities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;
//import org.springframework.web.bind.annotation.*;

import com.qa.personproject.entities.Person;

import java.util.List;

@Service
public class PersonService {

    @Autowired
    private PersonRepository people;

    

    public void newPerson(String firstName, String lastName, int age) {
        Person newPerson = new Person(firstName, lastName, age);
        people.save(newPerson);
    }

    public List<Person> getPeople() {
        return people.findAll();
    }

    public void deletePerson(long id) {
        people.deleteById(id);
    }

    public void updatePerson(long id, String firstName, String lastName, int age) {
        if (people.existsById(id)) {
            people.deleteById(id);
            Person newPerson = new Person(firstName, lastName, age);
            this.people.save(newPerson);
        }
    }
}