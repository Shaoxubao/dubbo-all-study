package com.baoge;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * Copyright 2018-2028 Baoge All Rights Reserved.
 * Author: Shao Xu Bao <xubao_shao@163.com>
 * Date:   2020/10/14
 */
public class MyNamespaceHandler extends NamespaceHandlerSupport {

    public void init() {
        registerBeanDefinitionParser("people", new PeopleBeanDefinitionParser());
    }
}
