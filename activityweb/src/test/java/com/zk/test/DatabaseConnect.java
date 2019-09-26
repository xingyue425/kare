package com.zk.test;

import com.zk.mapper.PaymentActivityInfoMapper;
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
public class DatabaseConnect {

    @Autowired
    private PaymentActivityInfoMapper mapper;

    @Test
    public void testDatasourceConnect(){

        System.out.println(mapper.testConnect());
    }
}
