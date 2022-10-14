package com.jk.explore.java.basics.hash.v1;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Employee {

    private static Logger logger = LoggerFactory.getLogger(Employee.class);

    private int id;

    public Employee(int id) {
        this.id = id;
        logger.info("Created Employee instance with id: "+id);
    }

    @Override
    public int hashCode() {
        logger.info("Called hash code method from Employee class. Hash code is: "+ super.hashCode());
        return super.hashCode();
    }

}
