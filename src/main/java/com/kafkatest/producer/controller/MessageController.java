package com.kafkatest.producer.controller;

import com.kafkatest.producer.service.MessageProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/kafka")
@RequiredArgsConstructor
public class MessageController {

    private final MessageProducer producer;

    @PostMapping("/publish")
    public String sendMessage(@RequestBody String message) {
        producer.sendMessage(message);
        return "Сообщение успешно отправлено в топик!";
    }
}