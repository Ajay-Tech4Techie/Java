package com.java.FileIO.demo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileIOBufferingDemo {

    public static void main(String[] args) throws IOException {

        //Java 1.7 try with resource - But only the resources that implement the interface �java.lang.AutoCloseable� can be declared
        try (BufferedReader br = new BufferedReader(new FileReader("E:\\objects\\Employee1\\pickmyclick.notes.txt"))) {
            String sCurrentLine;
            while ((sCurrentLine = br.readLine()) != null) {
                System.out.println(sCurrentLine);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
