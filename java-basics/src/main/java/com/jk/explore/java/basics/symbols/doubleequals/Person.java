package com.jk.explore.java.basics.symbols.doubleequals;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This class is to help describe:
 * <li> The operator <b>==</b></li>
 * <li> Aliases to object references</li>
 * <li> Passing of objects through references/addresses</li>
 * <li>Side effects on object content through aliases</li>
 * through the test class com.jk.explore.java.basics.symbols.doubleequals.PersonTest
 */
public class Person {

    private static final Logger logger = LoggerFactory.getLogger(Person.class);

    private String name;

    private int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
        logger.info("Person instance created: { name = "+name + " , id = "+id+ " }");
    }

    public String getName() {
        logger.info("getName() called on Person: {name = "+name + " , id = "+id+ " }");
        return name;
    }

    public void setName(String name) {
        logger.info("setName() called on Person: {name = "+name + " , id = "+id+ " }");
        this.name = name;
    }

    public int getId() {
        logger.info("getId() called on Person: {name = "+name + " , id = "+id+ " }");
        return id;
    }

    public void setId(int id) {
        logger.info("setId() called on Person: {name = "+name + " , id = "+id+ " }");
        this.id = id;
    }
}
