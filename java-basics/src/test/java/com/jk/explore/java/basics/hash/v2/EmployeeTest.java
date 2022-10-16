package com.jk.explore.java.basics.hash.v2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EmployeeTest {

    private static Logger logger = LoggerFactory.getLogger(EmployeeTest.class);

    @Test
    public void testHashCodeOfObject() {
        Employee employee = new Employee(10);
        assertTrue(employee.hashCode() <= Integer.MAX_VALUE);
    }

    @Test
    public void addEmployeesToSet() {
        Set<Employee> employeeSet = new HashSet<>();
        for(int i=0; i<= 5; i++) {
            logger.info("---------Adding employee with id: "+i+ "---------");
            Employee e = new Employee(i);
            employeeSet.add(e);
            logger.info("---------Added employee with id: "+i+ "---------");
        }
        assertEquals(6, employeeSet.size());
        Employee searchEmployee = new Employee(5);
        logger.info("---------Search for employee with id: "+5+ "---------");
        boolean found = employeeSet.contains(searchEmployee);
        Assertions.assertTrue(found);
        logger.info("---------Search for employee with id: "+5+ " is done---------");
    }

    @Test
    public void addEmployeeToMap() {
        Employee employee1 = new Employee(1);
        Employee employee2 = new Employee(1);
        Employee employee1dupe = employee1;
        Map<Employee, Employee> hashMap = new HashMap<>();
        hashMap.put(employee1, employee1);
        hashMap.put(employee2, employee2);
        Employee e = hashMap.put(employee1dupe, employee1dupe);
    }

    @Test
    public void addEmployeeToList() {
        Employee employee = new Employee(1);
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee);
    }


}

