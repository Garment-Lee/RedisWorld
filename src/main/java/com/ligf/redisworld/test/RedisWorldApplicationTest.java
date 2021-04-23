package com.ligf.redisworld.test;

import com.ligf.redisworld.pojo.SysUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Redis单元测试类
 * @author Garment
 * @date 2020年7月29日00:03:14
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisWorldApplicationTest {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private RedisTemplate<String, Serializable> serializableRedisTemplate;

    @Test
    public void testRedisString(){
        stringRedisTemplate.opsForValue().set("testKey", "redis");
        System.out.println("get value :" + stringRedisTemplate.opsForValue().get("testKey"));
    }

    @Test
    public void testRedisSerializable(){
        SysUser sysUser = new SysUser();
        sysUser.setUid(123);
        sysUser.setUserName("Garment");
        sysUser.setPassword("123456");
        serializableRedisTemplate.opsForValue().set("testObject", sysUser);
        System.out.println("get object:" + serializableRedisTemplate.opsForValue().get("testObject"));

        SysUser sysUser1 = new SysUser();
        sysUser.setUid(123);
        sysUser.setUserName("Garment1");
        sysUser.setPassword("123456");

        SysUser sysUser2 = new SysUser();
        sysUser.setUid(123);
        sysUser.setUserName("Garment2");
        sysUser.setPassword("123456");

        List<SysUser> list = new ArrayList();
        list.add(sysUser1);
        list.add(sysUser2);
//        serializableRedisTemplate.opsForValue().set("sysList:", list);
    }

}
