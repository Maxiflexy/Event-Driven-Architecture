package com.maxiflexy.stockservice.kafka;

import com.maxiflexy.basedomains.dto.OrderEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class OrderConsumer {

    @KafkaListener(topics = "${spring.kafka.topic.name}", groupId = "${spring.kafka.consumer.group-id}")
    public void consumeMessage(OrderEvent event){
        log.info("Order event received in stock service, {}", event.toString());

        // save the event data to a database
    }
}
