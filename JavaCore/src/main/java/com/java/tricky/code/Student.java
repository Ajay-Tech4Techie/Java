package com.java.tricky.code;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private String name;
    private int marks;
    private String collage;

    public Student() {
        super();

    }

    static List<Student> alStd = new ArrayList<Student>();

    static {
        alStd.add(new Student("S1", 10, "Col1"));
        alStd.add(new Student("S2", 15, "Col2"));
        alStd.add(new Student("S3", 15, "Col3"));
        alStd.add(new Student("S4", 10, "Col4"));
        alStd.add(new Student("S5", 10, "Col5"));
        alStd.add(new Student("S5", 90, "Col6"));
        alStd.add(new Student("S6", 90, "Col7"));
    }

    public List<Student> getListStudent() {
        return alStd;
    }

    public Student(String name, int marks, String collage) {
        super();
        this.name = name;
        this.marks = marks;
        this.collage = collage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getCollage() {
        return collage;
    }

    public void setCollage(String collage) {
        this.collage = collage;
    }

    @Override
    public String toString() {
        return "Name :" + this.name + "  Marks :" + this.marks + "  colleage :" + this.collage;
    }


}
