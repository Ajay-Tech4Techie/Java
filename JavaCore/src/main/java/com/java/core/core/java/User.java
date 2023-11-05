package com.java.core.core.java;

public class User {

    protected int userID;

    static {
        System.out.println("[User class] Static Block only once when class is loaded");
    }
}
