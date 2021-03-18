package com.rezahdrm.structural.flyweight;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PersonFlyweightTest {

    @Test
    void testFlyWeight() {
        PersonTable.initPersonTable();
        PersonService personService = new PersonService();
        final Person p1 = personService.findById(1L);
        final Person p2 = personService.findById(1L);
        System.out.println(p1);
        System.out.println(p2);
        Assertions.assertEquals(System.identityHashCode(p1), System.identityHashCode(p2));
    }
}