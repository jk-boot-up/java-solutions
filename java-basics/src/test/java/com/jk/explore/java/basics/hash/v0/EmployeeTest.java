package com.jk.explore.java.basics.hash.v0;

import com.jk.explore.java.basics.hash.v1.Employee;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EmployeeTest {

    @Test
    public void testHashCodeOfObject() {
        com.jk.explore.java.basics.hash.v1.Employee employee = new Employee(1);
        System.out.println(employee.hashCode());
        System.out.println(Integer.MAX_VALUE);
        Assertions.assertTrue(employee.hashCode() <= Integer.MAX_VALUE);
    }

}

