/**
 * Copyright (c) 2018 LINJUANJUAN TECHNOLOGY Inc. All rights reserved.
 */
package com.codedemo.lcn.service2;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @Describe: 服务2
 * @Author: linjuanjuan
 * @Date: 2018/6/6 21:12
 * @Version: 1.0
 */
@Slf4j
@EnableEurekaClient
@SpringBootApplication
@EnableTransactionManagement
public class Service2Application {

    public static void main(String[] args) {
        SpringApplication.run(Service2Application.class, args);
        log.info("========== 启动成功 ==========");
    }

}
