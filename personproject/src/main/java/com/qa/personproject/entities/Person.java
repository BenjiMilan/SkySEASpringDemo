package com.qa.personproject.entities;

import javax.persistence.*;
import javax.validation.constraints.Size;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Entity
@Table(name = "Person")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Size(max=30,min=2)
    @Column(name = "FIRST_NAME", nullable = false)
    private String firstName;

    @Size(max=30,min=2)
    @Column(name = "LAST_NAME", nullable = false)
    private String lastName;

    @Max(value=75)
    @Min(value=18)
    @Column(name = "AGE", nullable = false)
    private int age;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName)  {
        this.lastName = lastName;
    }

    public Person() {
        super();
    }

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
}
