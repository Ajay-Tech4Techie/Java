package com.java.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class ComparatorLambdaExmaple {

    public static void main(String[] args) {

        //until java 7
        Comparator<Employee> comparator = new Comparator<Employee>() {
            @Override
            public int compare(Employee emp1, Employee emp2) {
                return emp1.getEmpId().compareTo(emp2.getEmpId());     // 0 -> i1 == i2
                // 1 -> i1 > i2
            }                                //-1 -> i1 < i2
        };

        Employee emp1 = new Employee(111, "Vijay", new Date());
        Employee emp2 = new Employee(222, "Ajay", new Date());

        List<Employee> empList = Arrays.asList(emp1, emp2);

        Collections.sort(empList, comparator);


        System.out.println("empList : " + empList);

        //Lambda
        Comparator<Employee> lambdaComparatorSortByName = (Employee a, Employee b) -> a.getName().compareTo(b.getName());

        Collections.sort(empList, lambdaComparatorSortByName);

        System.out.println("empList : " + empList);
    }

}
