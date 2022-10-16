package com.jk.explore.java.basics.hash.v1;


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

    @Override
    public int hashCode() {
        logger.info("hashCode called. hash code is: "+ super.hashCode());
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        //return (this == obj);
        logger.info("equals called. results is: "+ super.equals(obj));
        return super.equals(obj);
    }
}
