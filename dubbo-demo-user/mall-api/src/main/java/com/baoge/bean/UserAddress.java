package com.baoge.bean;

import java.io.Serializable;

/**
 * Copyright 2018-2028 Baoge All Rights Reserved.
 * Author: Shao Xu Bao <xubao_shao@163.com>
 * Date:   2020/10/21
 */
public class UserAddress implements Serializable {

    private Integer id;

    private String address;

    private String name;

    private String phone;

    public UserAddress() {
        super();
    }

    public UserAddress(Integer id, String address, String name, String phone) {
        this.id = id;
        this.address = address;
        this.name = name;
        this.phone = phone;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
