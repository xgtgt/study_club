package com.studyclub.club.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Author: xgt
 * @CreateTime: 2024-08-31
 * @Description:网关启动器
 * @Version: 1.0
 */
@SpringBootApplication
@ComponentScan("com.studyclub")
public class GatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class);
    }

}
