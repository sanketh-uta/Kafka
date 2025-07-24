package com.sanbro.KafkaProducer;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrderController {
    private final KafkaTemplate<String,Order> kafkaTemplate;
    public OrderController(KafkaTemplate<String,Order> kafkaTemplate){
        this.kafkaTemplate = kafkaTemplate;
    }
    @PostMapping("/send")
    public String OrderPlaced(@RequestBody Order order){
        kafkaTemplate.send("orders-placed",order);
        return "Orders published to the topic";
    }
}
