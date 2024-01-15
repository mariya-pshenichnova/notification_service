package com.example.notification_service.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class NotificationRequest {
    private String text;
    private String email;
    private String phoneNumber;
}
