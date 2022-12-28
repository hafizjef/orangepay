package org.example;

import java.io.BufferedReader;
import java.io.Console;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String filename;

        if (args.length > 0) {
            filename = args[0];
        } else {
            Console console = System.console();
            filename = console.readLine("Input filename: ");
        }

        Path filePath = Paths.get(filename);

        try (BufferedReader reader = Files.newBufferedReader(filePath)) {
            List<Person> personList = new ArrayList<>();
            List<Person> duplicateList = new ArrayList<>();

            reader.lines().forEach(line -> {
                String[] str = line.split(",");
                Person person = new Person(str[1], str[2], str[3], str[4]);
                personList.add(person);
            });


            for (Person p1 : personList) {
                for (Person p2 : personList) {
                    if (p1.equals(p2)) {
                        continue;
                    }
                    if (p1.samePerson(p2)) {
                        duplicateList.add(p1);
                    }
                }
            }

            personList.removeAll(duplicateList);

            System.out.println("Duplicate Person");
            duplicateList.forEach(System.out::println);

            System.out.println("Unique Person");
            personList.forEach(System.out::println);

        } catch (Exception ex) {
            System.out.println("Error, " + ex);
        }

    }
}