package com.amigoscode.notification;

import lombok.*;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.SequenceGenerator;
import java.time.LocalDateTime;



@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@ToString
public class Notification {

    @Id
    @SequenceGenerator(
            name = "notification_id_sequence",
            sequenceName = "notification_id_sequence")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "notification_id_sequence")
    private Integer id;
    private String message;
    private String sender;
    private LocalDateTime sendAt;
    private String toCustomerEmail;
    private Integer toCustomerId;
}
