package com.amigoscode.clients.notification;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.management.Notification;

@FeignClient("notification")
public interface NotificationClient {

    @PostMapping("api/v1/send-notification")
    void sendNotification(@RequestBody NotificationRequest notificationRequest);
}
