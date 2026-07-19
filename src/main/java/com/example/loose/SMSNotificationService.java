package com.example.loose;

public class SMSNotificationService implements NotificationService {
  //method name should not change
    @Override
    public void send(String message) {
        System.out.println("SMS: " +message);
    }
}
