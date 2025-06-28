package com.amman.kafka_demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;

import com.amman.kafka_demo.payload.Student;
import com.amman.kafka_demo.producer.KafkaJsonProducer;
import com.amman.kafka_demo.producer.KafkaProducer;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/messages")
@RequiredArgsConstructor
public class MessageController {
    private final KafkaProducer producer;
    private final KafkaJsonProducer jsonProducer;
    @PostMapping
    public ResponseEntity<String> sendMessage(
         @RequestBody String msg
    ){
        producer.sendMessage(msg);
       return ResponseEntity.ok("Message queed sucessfuly.");
    }
     @PostMapping("/json")
    public ResponseEntity<String> sendJsonMessage(
         @RequestBody Student msg
    ){
        jsonProducer.sendMessage(msg);
       return ResponseEntity.ok("Message queed sucessfuly.");
    }
}
