package com.laxmi.kafka.springbootkafkaproducer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {
    @KafkaListener(topics = "test_topic", groupId = "group_id")
    public void consumeMessage(final String message){
        System.out.println("message->" + message  );
    }
}
