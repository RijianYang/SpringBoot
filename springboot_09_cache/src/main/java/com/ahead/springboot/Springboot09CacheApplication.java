package com.ahead.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@MapperScan("com.ahead.springboot.mapper")
@EnableCaching
public class Springboot09CacheApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot09CacheApplication.class, args);
    }

}
