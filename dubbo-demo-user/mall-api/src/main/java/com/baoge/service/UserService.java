package com.baoge.service;

import com.baoge.bean.UserAddress;

import java.util.List;

/**
 * Copyright 2018-2028 Baoge All Rights Reserved.
 * Author: Shao Xu Bao <xubao_shao@163.com>
 * Date:   2020/10/21
 *
 *  用户服务接口
 */
public interface UserService {

    public List<UserAddress> getUserAddressList(Integer userId);

}
