package org.example;

import java.util.Objects;

public class Person {
    String name;
    String IdType;
    String IdNumber;
    String dob;

    public Person(String name, String idType, String idNumber, String dob) {
        this.name = name;
        IdType = idType;
        IdNumber = idNumber;
        this.dob = dob;
    }

    public boolean samePerson(Person person) {
        int counter = 0;
        if (Objects.equals(name, person.name)) {
            counter += 1;
        }
        if (Objects.equals(IdType, person.IdType) && Objects.equals(IdNumber, person.IdNumber)) {
            counter += 1;
        }
        if (Objects.equals(dob, person.dob)) {
            counter += 1;
        }
        return counter >= 2;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", IdType='" + IdType + '\'' +
                ", IdNumber='" + IdNumber + '\'' +
                ", dob='" + dob + '\'' +
                "}";
    }
}
