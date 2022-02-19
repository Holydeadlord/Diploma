package com.demo.demo.Mq;


import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.UUID;

@RestController
@Slf4j
public class MessagePublisher {
    @Autowired
    private RabbitTemplate template;


    @PostMapping("/publish")
    public String  publishMessage(@RequestBody CustomMessage message){
    message.setMessageId(UUID.randomUUID().toString());
    message.setMessageDate(new Date());
    template.convertAndSend(MQConfig.EXCHANGE,
            MQConfig.ROUTING_KEY, message);
    log.info("This is an info message",message.getMessage());

    return "Message Published";
    }
}
