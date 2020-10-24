package com.baoge.service;

import com.baoge.bean.UserAddress;

import java.util.List;

/**
 * Copyright 2018-2028 Baoge All Rights Reserved.
 * Author: Shao Xu Bao <xubao_shao@163.com>
 * Date:   2020/10/21
 */
public interface OrderService {
    public List<UserAddress> createOrder(Integer userId);
}
