package com.amman.kafka_demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;

import com.amman.kafka_demo.producer.KafkaProducer;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/messages")
@RequiredArgsConstructor
public class MessageController {
    private final KafkaProducer producer;
    @PostMapping
    public ResponseEntity<String> sendMessage(
         @RequestBody String msg
    ){
        producer.sendMessage(msg);
       return ResponseEntity.ok("Message queed sucessfuly.");
    }
}
