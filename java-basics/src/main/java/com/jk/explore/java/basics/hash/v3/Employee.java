package com.jk.explore.java.basics.hash.v3;


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
        logger.info("hashCode called. hash code is: "+ id);
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            logger.info("equals called. results is: "+ true);
            return true;
        }
        if(obj == null) {
            logger.info("equals called. results is: "+ false);
            return false;
        }
        if(obj.getClass() == this.getClass()) {
            Employee other = (Employee) obj;
            if(other.id == this.id) {
                logger.info("equals called. results is: "+ true);
                return true;
            }
            logger.info("equals called. results is: "+ false);
            return false;
        }
        logger.info("equals called. results is: "+ false);
        return false;
    }
}


