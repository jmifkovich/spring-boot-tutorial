package com.bitworks.example.repositories;

import com.bitworks.example.entities.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Integer>
{
    Person findPersonById(Integer id);
}

