package com.baoge;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Copyright 2018-2028 Baoge All Rights Reserved.
 * Author: Shao Xu Bao <xubao_shao@163.com>
 * Date:   2020/10/14
 */
public class TestSchema {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("/xml/application.xml");
        People p = (People) ctx.getBean("baoge");
        System.out.println(p.getId());
        System.out.println(p.getName());
        System.out.println(p.getAge());
    }
}
