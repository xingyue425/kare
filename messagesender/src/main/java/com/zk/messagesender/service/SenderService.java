package com.zk.messagesender.service;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SenderService {

    @Autowired
    private AmqpTemplate template;

    public void sendMsg(){

        for(int i=0;i<100;i++){
            template.convertAndSend("bonusSendKey","Hello"+i);
        }
    }
}
