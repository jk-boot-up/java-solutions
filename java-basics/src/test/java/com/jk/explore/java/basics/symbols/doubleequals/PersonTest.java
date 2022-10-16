package com.jk.explore.java.basics.symbols.doubleequals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PersonTest {

    @Test
    @DisplayName("The symbol == compares object addresses for non-primitives (Objects). For primitives it compares values/literals")
    public void doubleEqualsSymbolTest() {
        // primitives
        assertTrue(false == false);
        assertTrue(4 == 4);
        // non-primitives (objects)
        String name1 = new String("ABCD");
        String name2 = new String ("ABCD");
        assertFalse(name1 == name2);
        assertTrue(name1 != name2);
        Integer i1 = new Integer(10);
        Integer i2 = new Integer(10);
        assertTrue(i1 != i2);
        assertFalse(i1 == i2);
        assertTrue(null == null);
        Boolean b1 = new Boolean(true);
        Boolean b2 = new Boolean(true);
        assertFalse(b1 == b2);
        assertTrue(b1 != b2);
    }

    @Test
    @DisplayName("Aliases refers to the same original object")
    public void objectReferenceAliasesTest() {
        Person person = new Person("XYZ", 10);
        Person p1 = person;
        assertTrue(p1 == person);
        Person p2 = p1;
        assertTrue(p2 == p1);
        assertTrue(p2 == person);
        assertTrue(p1.getId() == person.getId());
    }

    @Test
    @DisplayName("Objects are passed by references/addresses")
    public void createAliasTest() {
        Person person = new Person("ABC", 20);
        Person p1 = createAlias(person);
        Person p2 = createAlias(p1);
        Person p3 = createAlias(p2);
        Person p4 = createAlias(p3);
        assertTrue(p1 == person);
        assertTrue(p2 == person);
        assertTrue(p3 == person);
        assertTrue(p1 == p2);
        assertTrue(p1 == p3);
        assertTrue(p2 == p3);
        assertTrue(p1.getId() == person.getId());
        assertEquals(p1.getName(), person.getName());
        assertEquals(p3.getName(), person.getName());
        assertEquals(p1.getName(), p2.getName());
    }

    private Person createAlias(Person original) {
        Person alias = original;
        return alias;
    }

    @Test
    @DisplayName("We can cause side effects to objects through object reference aliases")
    public void sideEffectsWithAliases() {
        Person original = new Person("PQR", 30);
        Person p1 = createAlias(original);
        assertEquals("PQR", p1.getName());
        p1.setName("GHI");
        assertEquals("GHI", original.getName());
    }

}
