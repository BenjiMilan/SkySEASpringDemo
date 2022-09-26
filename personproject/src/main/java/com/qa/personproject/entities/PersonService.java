package com.qa.personproject.entities;

import java.util.ArrayList;

import org.springframework.stereotype.*;
//import org.springframework.web.bind.annotation.*;

@Service
public class PersonService {

    private ArrayList<Person> people;

    public PersonService() {
        
        this.people = new ArrayList<>();
    }

    public void newPerson(String firstName, String lastName, int age) {
        Person newPerson = new Person(firstName, lastName, age);
        people.add(newPerson);
    }

    public ArrayList<Person> getPeople() {
        return people;
    }

    public void deletePerson(long id) {
        people.remove((int) id);
    }

    public void updatePerson(long id, String firstName, String lastName, int age) {
        Person newPerson = new Person(firstName, lastName, age);
        this.people.set((int) id, newPerson);
    }
}