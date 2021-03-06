package com.baoge;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Copyright 2018-2028 Baoge All Rights Reserved.
 * Author: Shao Xu Bao <xubao_shao@163.com>
 * Date:   2020/10/24
 */

@EnableDubbo
@SpringBootApplication
public class OrderControllerStart {

    public static void main(String[] args) {
        SpringApplication.run(OrderControllerStart.class, args);
    }

}
