package com.java.design.patterns.creational;

public class BotCallNotification implements Notification {

    @Override
    public void notifyUser() {
        System.out.println("Sending a Bot call notification");
    }

}
