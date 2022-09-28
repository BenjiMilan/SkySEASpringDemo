package com.qa.personproject.controllers;

import java.util.List;

import javax.validation.constraints.Size;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.MediaType;


import com.qa.personproject.entities.Person;
import com.qa.personproject.services.PersonService;

@RestController
@RequestMapping("people")
public class PersonController {

    @Autowired
    private PersonService service;

    @PostMapping("new")
    public void createPerson(@RequestParam @Size(min = 2, max = 30) String firstName, @RequestParam @Size(min = 2, max = 30) String lastName, @RequestParam int age) {
        service.newPerson(firstName, lastName, age);
    }

    @ResponseBody
    @GetMapping(value = "all", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Person> getPeople() {
        return service.getPeople();
    }

    @DeleteMapping("delete/{id}")
    public void deletePerson(@RequestParam long id) {
        service.deletePerson(id);
    }

    @PutMapping("update/{id}")
    public void updatePerson(@RequestParam long id, @RequestParam @Size(min = 2, max = 30) String firstName, @RequestParam @Size(min = 2, max = 30) String lastName, @RequestParam int age) {
        service.updatePerson(id, firstName, lastName, age);
    }

}
