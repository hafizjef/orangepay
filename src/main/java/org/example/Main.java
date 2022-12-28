package org.example;

import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Path filePath = Paths.get("interviewFindRelationship.csv");

        try (BufferedReader reader = Files.newBufferedReader(filePath)) {

            List<Person> personList = new ArrayList<>();
            List<Person> duplicateList = new ArrayList<>();

            reader.lines().forEach(line -> {
                String[] str = line.split(",");
                Person person = new Person(str[1], str[2], str[3], str[4]);
                personList.add(person);
            });

            for (Person person: personList) {
                for (Person p1: personList) {
                    if (person.equals(p1)) {
                        continue;
                    }
                    int counter = 0;
                    if (person.name.equals(p1.name)) {
                        counter += 1;
                    }
                    if (person.IdType.equals(p1.IdType) && person.IdNumber.equals(p1.IdNumber)) {
                        counter += 1;
                    }
                    if (person.dob.equals(p1.dob)) {
                        counter += 1;
                    }

                    if (counter >= 2) {
                        System.out.println("Duplicate:\n" + p1 + "\n" + person);
                    }
                }
            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}