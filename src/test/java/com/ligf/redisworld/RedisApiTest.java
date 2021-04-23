package com.ligf.redisworld;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @ClassName RedisApiTest
 * @Description TODO
 * @Author Garment Lee
 * @Date 2021/4/21 14:54
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisApiTest {

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    @Autowired
    private ValueOperations valueOperations;

    @Autowired
    private HashOperations hashOperations;

    @Test
    public void testValueOperation(){
        valueOperations.set("key1", "value1");
        System.out.println("key1:" + valueOperations.get("key1"));
    }

    @Test
    public void testHashOperation(){
        hashOperations.put("userInfo", "name", "Garment");
        System.out.println("userInfo:" + hashOperations.get("userInfo", "name"));
    }
}
