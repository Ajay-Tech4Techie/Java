package com.java.core.core.java;

public class SwitchExample {
    static int score = 2;

    public static void main(String args[]) {
        switch (score) {
            case 1:
                System.out.println("Score is 1");

            case 2:
                System.out.println("Score is 2");
                //break;
            default:
                System.out.println("Default Case");
        }

    }

}
