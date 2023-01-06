package com.crossasyst.kafkaproducerdemo.controller;

import com.crossasyst.kafkaproducerdemo.service.ProducerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/kafka")
public class ProducerController {
private final ProducerService producerService;
@GetMapping(value = "/send")
    public void send(){
    producerService.send(" producer  massage");
}

}
