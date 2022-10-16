package com.jk.explore.java.basics.symbols.doubleequals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * This class is to help describe:
 * <li> The operator <b>==</b></li>
 * <li> Aliases to references</li>
 * <li> Passing of objects through references/addresses</li>
 * <li>Side effects on object content through aliases</li>
 *
 */
public class PersonTest {

    private static final Logger logger = LoggerFactory.getLogger(PersonTest.class);

    @Test
    @DisplayName("Primitives test for == operator")
    public void doubleEqualsSymbolTestForPrimitives() {
        // primitives
        assertTrue(false == false);
        assertTrue(4 == 4);
    }

    @Test
    @DisplayName("String objects test for == operator")
    public void doubleEqualsSymbolTestForStringObjects() {
        //String objects
        String name1 = new String("ABCD");
        String name2 = new String ("ABCD");
        assertFalse(name1 == name2);
        assertTrue(name1 != name2);
    }

    @Test
    @DisplayName("Integer objects test for == operator")
    public void doubleEqualsSymbolTestForNonPrimitiveIntegers() {
        // Integer objects
        Integer i1 = new Integer(10);
        Integer i2 = new Integer(10);
        assertTrue(i1 != i2);
        assertFalse(i1 == i2);
    }

    @Test
    @DisplayName("Boolean objects test for == operator")
    public void doubleEqualsSymbolTestForBooleans() {
        Boolean b1 = new Boolean(true);
        Boolean b2 = new Boolean(true);
        assertTrue(b1 != b2);
        assertFalse(b1 == b2);
    }

    @Test
    @DisplayName("Null literals test for == operator")
    public void doubleEqualsSymbolTestForNullLiteral() {
        assertTrue(null == null);
    }

    @Test
    @DisplayName("Custom objects test for == operator")
    public void doubleEqualsSymbolTestForNonPrimitiveCustomObjects() {
        // Custom objects like Person
        Person x = new Person("X", 40);
        Person y = new Person("Y", 50);
        assertFalse(x == y);
        assertTrue(x != y);
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
        Person p3 = p1;
        assertTrue(p2 == p1);
        assertTrue(p3 == p1);
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
        assertTrue(p4 == p3);
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

    @Test
    public void sideEffectByMethodCall() {
        Person p1 = new Person("X1", 1);
        updatePerson(p1);
        assertEquals("ABCD", p1.getName());
        assertEquals(60, p1.getId());
    }

    private Person updatePerson(Person givenPerson) {
        givenPerson.setId(60);
        Person alias = givenPerson;
        alias.setName("ABCD");
        return alias;
    }

}
