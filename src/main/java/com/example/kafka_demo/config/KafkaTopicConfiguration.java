package com.example.kafka_demo.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfiguration {

    @Bean
    public NewTopic createTopic(){
        return TopicBuilder.name("demoTopic")
                .build();
    }

    @Bean
    public NewTopic createTopic_json(){
        return TopicBuilder.name("demoTopic_json")
                .build();
    }
}
