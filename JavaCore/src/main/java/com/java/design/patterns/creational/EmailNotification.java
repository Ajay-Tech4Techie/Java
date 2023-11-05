package com.java.design.patterns.creational;

public class EmailNotification implements Notification {

    @Override
    public void notifyUser() {
        System.out.println("Sending a Email notification");

    }

}
