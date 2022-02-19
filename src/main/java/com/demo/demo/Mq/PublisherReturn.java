package com.demo.demo.Mq;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.ReturnedMessage;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;

@RabbitListener
public class PublisherReturn implements RabbitTemplate.ReturnCallback {

    @Override
    public void returnedMessage(Message message, int i, String s, String s1, String s2) {

    }
  @RabbitListener(queues = MQConfig.QUEUE)
    @Override
    public void returnedMessage(ReturnedMessage CustomMessage) {
      System.out.println(CustomMessage);;
  }
}
