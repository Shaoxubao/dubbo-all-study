package com.baoge;

import com.baoge.service.OrderService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Copyright 2018-2028 Baoge All Rights Reserved.
 * Author: Shao Xu Bao <xubao_shao@163.com>
 * Date:   2020/10/22
 *
 * Dubbo配置与SpringBoot整合的三种方式
 * 第一种方式：
 * 注解的方式：在java类上使用Dubbo提供的注解
 * 第二种方式：
 * 配置文件方式：在xml配置文件中对Dubbo进行配置，包括服务应用的名称配置，注册中心配置，通信规则，服务提供者信息，服务消费者信息等
 * 第三种方式：
 * Java Config方法：通过java配置类（在一个java类上使用@Configuration注解）的方式配置注册中心，通信规则，服务提供者信息，服务消费者信息等
 */
public class ConsumerStart {

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("consumer.xml");
        OrderService orderService = ioc.getBean(OrderService.class);
        orderService.createOrder(6);

        System.out.println("调用完成.");

        System.in.read();
    }

}
