package com.bree.api;

import com.bree.common.config.redis.RedisUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ServiceApiApplicationTests {

    @Autowired
    private RedisUtils redisUtils;
    @Test
    public void contextLoads() {

    }

}
