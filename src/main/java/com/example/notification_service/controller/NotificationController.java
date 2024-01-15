package com.example.notification_service.controller;

import com.example.notification_service.model.NotificationRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/")
public class NotificationController {

    @PostMapping("/")
    public void sendNotification(@RequestBody NotificationRequest notificationRequest) {
        logNotificationRequest(notificationRequest.getText(), notificationRequest.getEmail(), notificationRequest.getPhoneNumber());
    }

    public void logNotificationRequest(String text, String email, String phoneNumber) {
        if (email == null && phoneNumber == null) {
            log.info("Не переданы данные для отправки текста");
        } else if (email != null && phoneNumber == null) {
            log.info("Отправь " + text + " на email " + email);
        } else {
            log.info("Отправь " + text + " на номер телефона " + phoneNumber);
        }
    }
}
