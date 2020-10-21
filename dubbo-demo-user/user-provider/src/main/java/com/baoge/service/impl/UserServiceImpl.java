package com.baoge.service.impl;

import com.baoge.bean.UserAddress;
import com.baoge.service.UserService;

import java.util.Arrays;
import java.util.List;

/**
 * Copyright 2018-2028 Baoge All Rights Reserved.
 * Author: Shao Xu Bao <xubao_shao@163.com>
 * Date:   2020/10/21
 */
public class UserServiceImpl implements UserService {

    @Override
    public List<UserAddress> getUserAddressList(Integer userId) {
        UserAddress address1 = new UserAddress(1, "西安市", "豹哥", "13939393933");
        UserAddress address2 = new UserAddress(2, "西安市灞桥区", "豹子", "13939393922");
        return Arrays.asList(address1, address2);
    }
}
