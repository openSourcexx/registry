package com.demo.rc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 注册中心启动器
 *
 * @author aq
 */
@SpringBootApplication
@EnableEurekaServer
public class RegistryCenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(RegistryCenterApplication.class, args);
    }

}
