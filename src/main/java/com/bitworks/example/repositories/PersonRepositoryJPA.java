package com.bitworks.example.repositories;

import com.bitworks.example.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepositoryJPA extends JpaRepository<Person, Integer> {
    Person findPersonById(Integer id);
}
