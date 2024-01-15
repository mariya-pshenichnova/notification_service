package com.example.notification_service.model;

import lombok.Data;

@Data
public class NotificationRequest {
    private String text;
    private String email;
    private String phoneNumber;
}
