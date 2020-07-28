package com.ligf.redisworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * 应用启动类
 * @author Garment
 * @date 2020年7月27日23:17:37
 */
@SpringBootApplication
public class RedisWorldApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(RedisWorldApplication.class);
    }

    public static void main(String[] args){
        SpringApplication.run(RedisWorldApplication.class, args);
    }
}
