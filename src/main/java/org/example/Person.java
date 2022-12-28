package org.example;

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
