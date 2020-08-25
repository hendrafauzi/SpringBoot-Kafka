package com.kafka.demo.service;

import com.kafka.demo.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducerService {

    private static final Logger logger = LoggerFactory.getLogger(User.class);
    private static final String TOPIC = "messages";

    @Autowired
    private KafkaTemplate<String, String> template;

    public void producer(String users)
    {
        logger.debug(String.format("#### LOGGER -> Produce Data -> %s", users));
        System.out.printf("#### SYSOUT -> Produce Data -> %s", users);
        this.template.send(TOPIC, users);
    }
}