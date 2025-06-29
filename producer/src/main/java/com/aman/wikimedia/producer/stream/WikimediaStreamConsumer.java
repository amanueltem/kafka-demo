package com.aman.wikimedia.producer.stream;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class WikimediaStreamConsumer {
    private final WebClient webClient;
    public WikimediaStreamConsumer(WebClient.Builder webclientBuilder){
        this.webClient=webclientBuilder
                        .baseUrl("https://stream.wikimedia.org/v2")
                        .build();
    }
  public void consumeStreamAndPublish(){
    webClient.get()
             .uri("/stream/recentchange")
             .retrieve()
             .bodyToFlux(String.class)
             .subscribe(log::info);
  }

}
