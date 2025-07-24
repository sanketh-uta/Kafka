package com.sanbro.KafkaConsumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ConsumeOrder {
    @KafkaListener(topics = "orders-placed",groupId = "Orders-Notification")
    public void readOrders(Order order){
        System.out.println("Orders details read from the kafka are "+order);
    }
}
