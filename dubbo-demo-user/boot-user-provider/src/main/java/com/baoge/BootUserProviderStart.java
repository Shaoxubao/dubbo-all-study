package com.baoge;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Copyright 2018-2028 Baoge All Rights Reserved.
 * Author: Shao Xu Bao <xubao_shao@163.com>
 * Date:   2020/10/21
 *
 * 1、导入依赖
 *      dubbo-starter
 *      dubbo其他依赖
 */

@EnableDubbo // 开启基于注解的dubbo功能
@SpringBootApplication
public class BootUserProviderStart {

    public static void main(String[] args) {
        SpringApplication.run(BootUserProviderStart.class, args);
    }

}
