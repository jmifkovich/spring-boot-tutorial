package com.example.springboottutorial.repositories;

import com.example.springboottutorial.entities.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Integer>
{
    Person findPersonById(Integer id);
}
