package com.java.FileIO.demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class FileOI {

    static Formatter fm;

    public static void openFile() {
        try {
            fm = new Formatter("Vijay.txt");
        } catch (Exception ex) {
        }
    }

    public static void writeFile() {
        fm.format("\n %s %s %s", "10 ", " Vijay ", " Singh");
        fm.format("\n %s %s %s", "20 ", " Singh ", " Chandel");
        fm.format("\n %s %s %s", "30 ", " Chandel ", " Singh");
    }

    public static void readFile() throws FileNotFoundException {
        File fl = new File("E:\\workspace\\CoreJavaExpert\\Vijay.txt");
        Scanner sc;
        sc = new Scanner("Vijay.txt");
        while (sc.hasNext()) {
            String id = sc.next();
            String fname = sc.next();
            String lname = sc.next();
            System.out.printf("%s %s %s", id, fname, lname);
        }

    }

    public static void closeFile() {
        fm.close();
    }


    public static void main(String[] args) {
        openFile();
        writeFile();
        //readFile();
        closeFile();
    }
}
