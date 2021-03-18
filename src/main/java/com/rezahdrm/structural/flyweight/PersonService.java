package com.rezahdrm.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

// Service
public class PersonService {
    private Map<Long, Person> personCache;

    public PersonService() {
        personCache = new HashMap<>();
    }

    public Person findById(Long personId) {
        if (personCache.containsKey(personId))
            return personCache.get(personId);
        else {
            final Person person = PersonTable.get(personId);
            personCache.put(personId, person);
            return person;
        }
    }
}
