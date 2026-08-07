package com.springbootcedrick.store;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
public class NotificationManager {
    private NotificationService notificationService;

    public NotificationManager(NotificationService notificationService) {
        this.notificationService = notificationService;
    }
    public void sendNotifcation(){
        notificationService.send("Welcome to Cedrick");
    }
}
