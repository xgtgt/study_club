package com.studyclub.oss;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Author: xgt
 * @CreateTime: 2024-08-23
 * @Description:oss服务启动类
 * @Version: 1.0
 */
@SpringBootApplication
@ComponentScan("com.studyclub")
public class OssApplication {

    public static void main(String[] args) {
        SpringApplication.run(OssApplication.class);
    }

}
