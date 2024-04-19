package com.example.kafka_demo.kafka;

import com.example.kafka_demo.models.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaConsumer.class);

    @KafkaListener(topics = "demoTopic", groupId = "spring.kafka.consumer.group-id")
    public void consume(String message) {
        LOGGER.info(String.format("message received -> %s", message));
    }

    @KafkaListener(topics = "demoTopic_json", groupId = "spring.kafka.consumer.group-id")
    public void consume(User user) {
        LOGGER.info(String.format("message received -> %s", user.toString()));
    }

}
