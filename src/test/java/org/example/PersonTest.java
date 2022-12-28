package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    Person p1, p2, p3, p4;



    @BeforeEach
    void setUp() {
        p1 = new Person("John", "IC", "001", "1970/01/25");
        p2 = new Person("Emery", "IC", "001", "1970/01/25");
        p3 = new Person("Emily", "IC", "002", "2000/01/01");
    }

    @Test
    void samePersonIfTwoOrMoreFieldAreEquals() {
        assertTrue(p1.samePerson(p2));
    }

    @Test
    void differentPersonIfNoneFieldAreEqual() {
        assertFalse(p1.samePerson(p3));
    }

    @Test
    void nullPersonShouldRaiseException() {
        assertThrows(NullPointerException.class, () -> p1.samePerson(p4));
    }
}