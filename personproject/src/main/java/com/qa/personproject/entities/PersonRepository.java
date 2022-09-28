package com.qa.personproject.entities;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

//import java.util.List;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
    
    @Query("SELECT p from Person p")
    Optional<Person> findAllJPQL();

    Optional<Person> getPersonByFirstNameIgnoreCase(String firstName);

    Optional<Person> getPersonById(long id);

    Optional<Person> findPersonByFirstNameAndAge(String firstName, long id);

    Optional<Person> findPersonByAgeLessThan(int age);
}
