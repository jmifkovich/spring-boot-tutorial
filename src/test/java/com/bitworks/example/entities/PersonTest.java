package com.bitworks.example.entities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void testEquals() {
        Person person1 = new Person();
        person1.setFirstName("First");
        person1.setLastName("Last");
        Person person2 = new Person();
        person2.setFirstName("First2");
        person2.setLastName("Last2");
        assertTrue(person1.equals(person1));
        assertFalse(person1.equals(person2));
    }
}