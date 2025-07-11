package com.aman.wikimedia.consumer.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class WikimediaConsumer {
    @KafkaListener(topics = "wikimedia-stream",groupId = "myGroup")
    public void consumeMsg(String msg){
        log.info(String.format("consuming the wikimedia-stream topic ::%s",msg));
    }
}
