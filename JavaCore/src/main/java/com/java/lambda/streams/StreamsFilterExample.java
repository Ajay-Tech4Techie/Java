package com.java.lambda.streams;


import java.util.List;

import com.java.lambda.data.Student;
import com.java.lambda.data.StudentDataBase;

import static java.util.stream.Collectors.toList;

public class StreamsFilterExample {

    public static List<Student> filterStudents() {

        List<Student> filteredStudentList = StudentDataBase.getAllStudents()
                .stream()
                .filter(student -> student.isGen() == false)
                //.filter(student -> student.getGender().equals("female"))
                .collect(toList());

        return filteredStudentList;
    }


    public static boolean findAnyGen() {

        boolean filteredStudentList = StudentDataBase.getAllStudents()
                .stream()
                .filter(student -> student.isGen() == false)
                //.filter(student -> student.getGender().equals("female"))
                .collect(toList()).isEmpty();

        return filteredStudentList;
    }

    public static void main(String[] args) {

        // System.out.println("Filtered Students : " + Collections.filterStudents());

        System.out.println("Filtered Students : " + findAnyGen());

    }
}
