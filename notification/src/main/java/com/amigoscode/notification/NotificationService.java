package com.amigoscode.notification;
import com.amigoscode.clients.notification.NotificationRequest;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public record NotificationService(NotificationRepository notificationRepository) {


    public void send(NotificationRequest notificationRequest) {
        Notification notification = Notification.builder()
                        .message(notificationRequest.message())
                        .toCustomerId(notificationRequest.toCustomerId())
                        .toCustomerEmail(notificationRequest.toCustomerEmail())
                        .sender("Amigoscode")
                        .sendAt(LocalDateTime.now())
                        .build();
        notificationRepository.save(notification);
    }
}
