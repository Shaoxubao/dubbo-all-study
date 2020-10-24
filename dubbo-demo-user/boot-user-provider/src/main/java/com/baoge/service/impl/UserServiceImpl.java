package com.baoge.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baoge.bean.UserAddress;
import com.baoge.service.UserService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * Copyright 2018-2028 Baoge All Rights Reserved.
 * Author: Shao Xu Bao <xubao_shao@163.com>
 * Date:   2020/10/21
 */

@Service // 暴露服务
@Component
public class UserServiceImpl implements UserService {

    @HystrixCommand
    @Override
    public List<UserAddress> getUserAddressList(Integer userId) {
        UserAddress address1 = new UserAddress(1, "西安市", "豹哥", "13939393933");
        UserAddress address2 = new UserAddress(2, "西安市灞桥区", "豹子", "13939393922");

        // 模拟容错
        if (Math.random() > 0.5) {
            throw new RuntimeException();
        }

        return Arrays.asList(address1, address2);
    }
}
