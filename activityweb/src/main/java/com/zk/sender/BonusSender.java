package com.zk.sender;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BonusSender{

    @Autowired
    private RabbitTemplate template;

    public void sendMsg(){
        template.convertAndSend("bonusExchange","bonusKey.effect","hello World!");
    }
}
