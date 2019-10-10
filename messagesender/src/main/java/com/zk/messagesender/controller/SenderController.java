package com.zk.messagesender.controller;

import com.zk.messagesender.service.SenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SenderController {

    @Autowired
    private SenderService service;

    @RequestMapping("/send")
    public String send(){

        service.sendMsg();
        return "sucess";
    }
}
