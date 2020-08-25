package com.kafka.demo.controller;

import com.google.gson.Gson;
import com.kafka.demo.model.User;
import com.kafka.demo.service.KafkaProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class KafkaController {

    @Autowired
    private final KafkaProducerService producerService;

    public KafkaController(KafkaProducerService producerService)
    {
        this.producerService = producerService;
    }

    @GetMapping(value = "/test-hello")
    public String testHelloWorld()
    {
        System.out.println("HELLO WORLD - TEST");
        return "HELLO WORLD";
    }

    @PostMapping(value = "/send-data/{message}")
    public void sendData(@PathVariable(value = "message") String message)
    {
        producerService.producer(message);
    }

    @PostMapping(value = "/send-data/data")
    public void sendJSON(@RequestBody User users)
    {
        producerService.producer(new Gson().toJson(users));
    }
}