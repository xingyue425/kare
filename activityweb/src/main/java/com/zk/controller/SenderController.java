package com.zk.controller;

import com.zk.sender.BonusSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SenderController {

    @Autowired
    private BonusSender sender;

    @RequestMapping("/msg")
    public String sendMess(){

        sender.sendMsg();
        return "success";
    }
}
