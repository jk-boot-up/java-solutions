package com.jk.explore.java.basics.hash.v1;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class EmployeeTest {

    @Test
    public void testHashCodeOfObject() {
        Employee employee = new Employee(1);
        assertTrue(employee.hashCode() <= Integer.MAX_VALUE);
    }

    @Test
    public void addEmployeeToSet() {
        Employee employee = new Employee(1);
        Set<Employee> employeeSet = new HashSet<>();
        employeeSet.add(employee);
        employeeSet.contains(employee);
    }

    @Test
    public void addEmployeeToMap() {
        Employee employee = new Employee(1);
        Map<Employee, Employee> hashMap = new HashMap<>();
        hashMap.put(employee, employee);
    }

    @Test
    public void addEmployeeToList() {
        Employee employee = new Employee(1);
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee);
    }


}
