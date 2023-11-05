package com.java.lambda.lambda;

import com.java.lambda.data.Student;
import com.java.lambda.data.StudentDataBase;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MapFunctionDemoLambdas {
    public static void main(String[] args) {
        List<Student> studList = StudentDataBase.getAllStudents();

        //One to one mapping - use of map()
        List<String> studentNames = studList.stream()
                .map(Student::getName)//data transformation
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());

        System.out.println("Student Name List "+studentNames);
        //flat map is for funtional

        //flatmap - one to many or nested list
        List<String> listOfListActivites = studList.stream()
                .flatMap(student -> student.getActivities().stream())
                .distinct() //to get all distinct
                .collect(Collectors.toList());

        System.out.println("list Of List Activites : "+listOfListActivites);
    }
}
