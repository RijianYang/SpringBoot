package com.ahead;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 1、配置Eureka信息
 * 2、@EnableEurekaServer
 */
@EnableEurekaServer
@SpringBootApplication
public class Springboot14EurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot14EurekaServerApplication.class, args);
    }

}
