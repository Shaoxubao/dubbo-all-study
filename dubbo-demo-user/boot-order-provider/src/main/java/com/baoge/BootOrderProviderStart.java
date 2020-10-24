package com.baoge;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * Copyright 2018-2028 Baoge All Rights Reserved.
 * Author: Shao Xu Bao <xubao_shao@163.com>
 * Date:   2020/10/22
 */

@EnableHystrix
@EnableDubbo
@SpringBootApplication
public class BootOrderProviderStart {

    public static void main(String[] args) {
        SpringApplication.run(BootOrderProviderStart.class, args);
    }

}
