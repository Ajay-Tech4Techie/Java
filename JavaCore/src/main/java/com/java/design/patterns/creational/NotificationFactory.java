package com.java.design.patterns.creational;

public class NotificationFactory {
    public Notification createNotification(String channel) {
        if (channel == null || channel.isEmpty())
            return null;
        if ("SMS".equals(channel)) {
            return new SMSNotification();
        } else if ("EMAIL".equals(channel)) {
            return new EmailNotification();
        } else if ("BOTCALL".equals(channel)) {
            return new BotCallNotification();
        }
        return null;
    }
}
