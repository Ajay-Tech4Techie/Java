package com.java.lambda.streams;

import java.util.Optional;

import com.java.lambda.data.Student;
import com.java.lambda.data.StudentDataBase;

public class StreamsFindAnyFirstExample {

    public static Optional<Student> findAny() {

        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.isGen() == false)
                .findAny();
    }

    public static Optional<Student> findFirst() {

        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGpa() >= 3.8)
                .findFirst();
    }

    public static void main(String[] args) {

        Optional<Student> findAnyStudent = findAny();
        if (findAnyStudent.isPresent()) {
            System.out.println("findAny Student is :" + findAnyStudent.get());
        } else {
            System.out.println("No Student Found");
        }

        Optional<Student> findFirst = findFirst();
        if (findFirst.isPresent()) {
            System.out.println("findFirst Student is :" + findFirst.get());
        } else {
            System.out.println("No Student Found");
        }
        //it will make a lot of different during parallel stream

    }
}
