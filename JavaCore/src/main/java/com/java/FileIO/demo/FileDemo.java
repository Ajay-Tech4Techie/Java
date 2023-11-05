package com.java.FileIO.demo;

import java.io.File;

public class FileDemo {

    public static void main(String[] args) {

        try {
            File file = new File("E:\\objects\\Employee1\\file.txt");
            if (file.exists()) {
                System.out.println("File Already Exists !");

            } else {
                file.createNewFile();
                System.out.println("New File created !");
            }

        } catch (Exception ex) {
            System.out.println("File Error!");
        }
    }

}
