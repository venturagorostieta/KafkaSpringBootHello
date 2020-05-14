package com.example.kafka.service;

import java.io.IOException;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {
	
	 @KafkaListener(topics = "kafka-test", groupId = "group_id")
	    public void consume(String message) throws IOException {
	        System.out.println(String.format("#### -> Consumed message -> %s", message));
	    }

}
