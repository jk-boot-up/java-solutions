package com.jk.explore.java.basics.equalsmethod.v0;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static java.lang.System.out;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class EqualsOnObjectTest {

    Logger logger = LoggerFactory.getLogger(EqualsOnObjectTest.class);

    @Test
    public void equalsTest1() {
        Object x = new Object();
        Object y = new Object();
        assertFalse(x.equals(y));
        out.println("x.equals(y) results is: " +  x.equals(y));
        logger.info("x.equals(y) results is: "+ x.equals(y));
    }

    @Test
    public void equalsTest2() {
        Object x = new Object();
        Object y = new Object();
        assertFalse(x == y);
        out.println("x == y results is: " +  (x == y));
        logger.info("x == y results is: "+ (x == y));
    }
}
