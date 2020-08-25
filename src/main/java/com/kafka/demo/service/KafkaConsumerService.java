package com.kafka.demo.service;

import com.kafka.demo.model.User;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    private static final Logger logger = LoggerFactory.getLogger(User.class);

    @KafkaListener(id = "kafka", topics = "messages")
    public void consumer(String message) {
        logger.debug(String.format("#### LOGGER -> Cosumed Data From Service -> %s", message));
        System.out.printf("#### SYSOUT -> Cosumed Data From Service -> %s", message);
    }
}