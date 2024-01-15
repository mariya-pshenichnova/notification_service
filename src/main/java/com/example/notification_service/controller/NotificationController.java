package com.example.notification_service.controller;

import com.example.notification_service.model.NotificationRequest;
import org.springframework.web.bind.annotation.*;

import java.util.logging.Logger;

@RestController
@RequestMapping("/")
public class NotificationController {

    @PostMapping("/")
    public void sendNotification(@RequestBody NotificationRequest notificationRequest) {
        Logger log = Logger.getLogger("log");

        log.info("Получено сообщение " + notificationRequest.getText() +
                " на номер телефона " + notificationRequest.getPhoneNumber()
                + " email " + notificationRequest.getEmail());
    }
}
