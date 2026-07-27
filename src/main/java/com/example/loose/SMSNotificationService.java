package com.example.loose;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SMSNotificationService implements NotificationService {
  //method name should not change
    @Override
    public void send(String message) {
        System.out.println("SMS: " +message);
    }
}
