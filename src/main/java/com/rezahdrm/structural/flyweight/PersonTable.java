package com.rezahdrm.structural.flyweight;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PersonTable {
    private static List<Person> people = null;
    private static PersonTable personTable = null;

    private PersonTable() {
        people = new ArrayList<>();
        people.add(new Person(1L, "Mike", "Tyson"));
        people.add(new Person(2L, "Evader", "Hayfield"));
        people.add(new Person(3L, "Lennox", "Lewis"));
        people.add(new Person(4L, "Roy", "Jones jr"));
        people.add(new Person(5L, "Floyd", "Mayweather"));
        people.add(new Person(6L, "Donovan", "Ruddock"));
    }

    public static void persist(Person person) {
        people.add(person);
    }

    public static List<Person> findAll() {
        return people;
    }

    public static Person get(long index) {
        return people.get((int) index - 1);
    }

    public static void initPersonTable() {
        if (Objects.isNull(personTable))
            personTable = new PersonTable();
    }
}
