package com.baoge.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;
import com.baoge.bean.UserAddress;
import com.baoge.service.OrderService;
import com.baoge.service.UserService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * Copyright 2018-2028 Baoge All Rights Reserved.
 * Author: Shao Xu Bao <xubao_shao@163.com>
 * Date:   2020/10/21
 *
 * 1、将服务提供者注册到注册中心
 *      1) 导入Dubbo依赖(2.6.2)，引入操作zk的客户端(Dubbo 2.6之后用的zk客户端是curator，2.6.0之前用zkClient)
 *      2) 配置服务提供者
 * 2、让消费者去注册中心订阅提供者的服务地址
 */


@Service // 暴露服务
@Component
public class OrderServiceImpl implements OrderService {

    @Reference
    private UserService userService;

    // 出现错误容错，调用hello方法
    @HystrixCommand(fallbackMethod = "hello")
    @Override
    public List<UserAddress> createOrder(Integer userId) {
        System.out.println("createOrder------");
        List<UserAddress> userAddressList = userService.getUserAddressList(userId);
        for (UserAddress address : userAddressList) {
//            System.out.println(address.getAddress());
        }

        return userAddressList;
    }

    public List<UserAddress> hello(Integer userId) {
        return Arrays.asList(new UserAddress(10, "富力", "豹哥", "15929892495"));
    }
}
