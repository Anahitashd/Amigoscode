package com.amigoscode.clients.notification;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

import javax.management.Notification;

@FeignClient("notification")
public interface NotificationClient {

    @PostMapping("api/v1/notification")
    void sendNotification(NotificationRequest notificationRequest);
}
