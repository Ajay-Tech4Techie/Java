package com.java.tricky.code;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DemoGruopBy {
    public static void main(String[] args) {

        Student st = new Student();
        List<Student> stdList = st.getListStudent();

        Map<Integer, Integer> count = new HashMap<Integer, Integer>();

        for (Student std : stdList) {
            if (count.containsKey(std.getMarks())) {
                int i = count.get(std.getMarks());
                count.put(std.getMarks(), ++i);
            } else {
                count.put(std.getMarks(), 1);
            }
        }
        System.out.println(count);
    }

}
