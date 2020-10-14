package com.baoge;

/**
 * Copyright 2018-2028 Baoge All Rights Reserved.
 * Author: Shao Xu Bao <xubao_shao@163.com>
 * Date:   2020/10/14
 */
public class Emp {

    private String ename;
    private int eno;

    public Emp() {
        ename = "yy";
        eno = 1;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public int getEno() {
        return eno;
    }

    public void setEno(int eno) {
        this.eno = eno;
    }


    // 添加一个自定义方法
    public void printInfo() {
        System.out.println("begin!");
        System.out.println(ename);
        System.out.println(eno);
        System.out.println("over!");
    }
}

