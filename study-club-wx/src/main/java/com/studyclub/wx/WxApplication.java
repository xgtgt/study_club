package com.studyclub.wx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


/**
 * @Author: xgt
 * @CreateTime: 2024-09-03
 * @Description: 微信服务启动器
 * @Version: 1.0
 */
@SpringBootApplication
@ComponentScan("com.studyclub")
public class WxApplication {

    public static void main(String[] args) {
        SpringApplication.run(WxApplication.class);
    }

}
