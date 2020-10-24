package com.baoge;

import com.baoge.service.OrderService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Copyright 2018-2028 Baoge All Rights Reserved.
 * Author: Shao Xu Bao <xubao_shao@163.com>
 * Date:   2020/10/22
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
