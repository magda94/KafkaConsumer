package com.example.kafkaTraining.kafka;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class MessageConsumer {

    @KafkaListener(topics = "user-topic", groupId = "group_id")
    public void consume(String message) {
        log.info("Received: {}", message);
    }
}
