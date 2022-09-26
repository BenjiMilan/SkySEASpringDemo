package com.qa.personproject.entities;

import java.util.ArrayList;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("people")
public class PersonController {

    private PersonService service;

    public PersonController(PersonService service) {
        super();
        this.service = service;
    }

    @PostMapping("new/{id}")
    public void createPerson(@PathParam("firstName") String firstName, @PathParam("lastName") String lastName, @PathParam("age") int age) {
        service.newPerson(firstName, lastName, age);
    }

    @ResponseBody
    @GetMapping(value = "/all", produces = "application/json")
    public ArrayList<Person> getPeople() {
        return service.getPeople();
    }

    @DeleteMapping("delete/{id}")
    public void deletePerson(@PathParam("id") long id) {
        service.deletePerson(id);
    }

    @PutMapping("update/{id}")
    public void updatePerson(@PathParam("id") long id, @PathParam("firstName") String firstName, @PathParam("lastName") String lastName, @PathParam("age") int age) {
        service.updatePerson(id, firstName, lastName, age);
    }

}
