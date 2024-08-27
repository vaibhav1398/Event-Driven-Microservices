package com.example.email_service.kafka;

import com.example.base_domains.dto.OrderEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class OrderConsumer {
    private static final Logger logger= LoggerFactory.getLogger(OrderConsumer.class);

    @KafkaListener(topics = "${spring.kafka.topic.name}"
                , groupId = "${spring.kafka.consumer.group-id}")
    public void consume(OrderEvent event){
        logger.info(String.format("Order event received in email service => %s", event.toString()));

        //after this we can send mail to customer about order

    }
}
