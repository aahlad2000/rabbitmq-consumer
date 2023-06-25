package com.learnings.rabbitmqconsumer.controller;


import com.learnings.rabbitmqconsumer.config.MessagingQueueConfig;
import com.learnings.rabbitmqconsumer.model.MessageModel;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class ListenerController {

    @RabbitListener(queues = MessagingQueueConfig.QUEUE)
    public void listener(MessageModel message) {
        System.out.println(message);
    }

}
