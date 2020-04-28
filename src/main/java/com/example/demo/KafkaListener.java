package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class KafkaListener {
    @Autowired
    ProductRepository productRepository;

    @StreamListener(Processor.INPUT)
    public void onEventByString(@Payload String productChanged){
        System.out.println(productChanged);
    }
}
