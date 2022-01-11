package com.example.springboottutorial.controllers;

import com.example.springboottutorial.entities.Person;
import com.example.springboottutorial.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class DemoController {


    @Autowired
    private PersonRepository personRepository;

    @PostMapping("/add")
    public String addPerson(@RequestParam String first, @RequestParam String last) {
        Person person = new Person();
        person.setFirstName(first);
        person.setLastName(last);
        personRepository.save(person);
        return "Added new customer to repo!";
    }

    @GetMapping("/list")
    public Iterable<Person> getPerson() {
        return personRepository.findAll();
    }

    @GetMapping("/find/{id}")
    public Person findPersonById(@PathVariable Integer id) {
        return personRepository.findPersonById(id);
    }
}


