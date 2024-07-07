package com.amigoscode.notification;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




@Slf4j
@RestController
@RequestMapping("api/v1/send-notification")
public record NotificationContoller(NotificationService notificationService) {

    @PostMapping
    public void sendNotification(@RequestBody NotificationRequest notificationRequest){
        log.info("Send notification request: {}",notificationRequest);
        notificationService.send(notificationRequest);

    }

}
