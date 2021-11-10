package com.rabbitmqspringbootapp.rabbitmqspringbootapp.listener;

import com.rabbitmqspringbootapp.rabbitmqspringbootapp.model.Notification;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class NotificationListener {

    @RabbitListener(queues = "test-queue")
    public void handleMessage(Notification notification) {
        System.out.println("Message Received");
        System.out.println(notification.toString());
    }

}
