package com.crossasyst.kafkaproducerdemo.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
@Log4j2
@Service
@Slf4j
@RequiredArgsConstructor
public class ProducerService {
   @Value("${topic.name.producer}")
    private String topicName;
    private  final KafkaTemplate<String, String> kafkaTemplate;

    public void send(String message) {
        log.info("Payload enviado : {}", message);
        kafkaTemplate.send(topicName,message);
    }
}
