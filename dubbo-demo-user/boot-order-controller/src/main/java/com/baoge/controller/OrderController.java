package com.baoge.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.baoge.bean.UserAddress;
import com.baoge.service.OrderService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Copyright 2018-2028 Baoge All Rights Reserved.
 * Author: Shao Xu Bao <xubao_shao@163.com>
 * Date:   2020/10/24
 */

@Controller
public class OrderController {

    @Reference
    private OrderService orderService;

    // http://127.0.0.1:8081/createOrder?uid=1
    @ResponseBody
    @RequestMapping("/createOrder")
    public List<UserAddress> createOrder(@RequestParam("uid") Integer userId) {
        return orderService.createOrder(userId);
    }

}
