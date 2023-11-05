package com.java.lambda.streams_terminal;

import java.util.stream.Collectors;

import com.java.lambda.data.StudentDataBase;

public class StreamsCountingExample {

    public static long count() {
        return StudentDataBase.getAllStudents()
                .stream()
                //.filter(student -> student.getGpa()>=3.9)
                .filter(s -> s.isGen() == false)
                .collect(Collectors.counting());
    }

    public static void main(String[] args) {

        System.out.println(count());
    }
}
