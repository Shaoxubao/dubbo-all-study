package com.baoge;

import org.I0Itec.zkclient.IZkChildListener;
import org.I0Itec.zkclient.ZkClient;

import java.util.List;

/**
 * Copyright 2018-2028 Baoge All Rights Reserved.
 * Author: Shao Xu Bao <xubao_shao@163.com>
 * Date:   2020/10/14
 *
 * 订阅节点的信息变更（创建节点、更新节点、添加子节点）
 */
public class SubscribeChildChanges {

    private static final String ZK_PATH = "/baoge6";

    private static class ZKChildListener implements IZkChildListener {

        /**
         * handleChildChange: 处理服务器端发送过来的通知
         * @param parentPath  对应的父节点路径
         * @param currentChilds 子节点的相对路径
         * @throws Exception
         */
        public void handleChildChange(String parentPath, List<String> currentChilds) throws Exception {
            System.out.println("订阅节点信息改变（创建节点、更新节点、添加子节点），parentPath：" + parentPath +
                    "，子节点的相对路径" + currentChilds);
        }
    }

    public static void main(String[] args) throws Exception {
        ZkClient zkClient = CreateSession.connectZK();
        zkClient.subscribeChildChanges(ZK_PATH, new ZKChildListener());

        Thread.sleep(Integer.MAX_VALUE);
    }

}
