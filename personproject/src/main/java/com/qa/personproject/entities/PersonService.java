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
}