package com.zk.test;

import com.zk.service.RedisService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:applicationContext.xml"})
@Transactional
@Rollback(false)
public class RedisConnect {

    @Autowired
    private RedisService service;

    @Test
    public void testRedis(){

        service.setValue("lali","gugujiao");
        System.out.println(service.getValue("lali"));
    }
}
