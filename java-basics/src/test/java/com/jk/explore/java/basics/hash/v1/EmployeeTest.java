package com.jk.explore.java.basics.hash.v1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EmployeeTest {

    @Test
    public void testHashCodeOfObject() {
        Employee employee = new Employee(1);
        assertTrue(employee.hashCode() <= Integer.MAX_VALUE);
    }

    @Test
    public void addEmployeeToSet() {
        Employee employee1 = new Employee(1);
        Employee employee2 = new Employee(2);
        Employee employee3 = employee1;
        Set<Employee> employeeSet = new HashSet<>();
        employeeSet.add(employee1);
        assertEquals(1, employeeSet.size());
        employeeSet.add(employee2);
        assertEquals(2, employeeSet.size());
        boolean employee3Added = employeeSet.add(employee3);
        Assertions.assertFalse(employee3Added);
        assertEquals(2, employeeSet.size());
        employeeSet.contains(employee3);
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
