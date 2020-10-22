package com.baoge;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Copyright 2018-2028 Baoge All Rights Reserved.
 * Author: Shao Xu Bao <xubao_shao@163.com>
 * Date:   2020/10/21
 */
public class ProviderStart {

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("provider.xml");
        ioc.start();

        System.out.println("Provider started.");
        System.in.read();
    }

}
