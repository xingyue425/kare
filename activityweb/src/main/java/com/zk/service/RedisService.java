package com.zk.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import redis.clients.jedis.JedisCluster;

@Service
public class RedisService {

    @Autowired
    private JedisCluster jedis;

    public void setValue(String key,String value){
        jedis.set(key,value);
    }
    public String getValue(String key){
        return jedis.get(key);
    }
}
