package com.jk.explore.java.basics.hash.v0;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// extends Object is redundant
public class Employee extends Object {
    private static Logger logger = LoggerFactory.getLogger(Employee.class);
    private int id;

    public Employee(int id) {
        this.id = id;
        logger.info("instance created with id: "+id);
    }
}
