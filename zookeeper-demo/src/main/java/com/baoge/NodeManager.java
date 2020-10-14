package com.baoge;

import org.I0Itec.zkclient.ZkClient;
import org.apache.zookeeper.CreateMode;

/**
 * Copyright 2018-2028 Baoge All Rights Reserved.
 * Author: Shao Xu Bao <xubao_shao@163.com>
 * Date:   2020/10/14
 */
public class NodeManager {

    private static final ZkClient ZK_CLIENT = CreateSession.connectZK();

    private static final String ZK_PATH = "/baoge6";

    public void createNode() {
        User user = new User();
        user.setId(1);
        user.setName("豹哥");

        String path = ZK_CLIENT.create(ZK_PATH, user, CreateMode.PERSISTENT);

        // 输出创建节点路径
        System.out.println("createNode path:" + path);
    }

    public void updateNode() {
        User user = new User();
        user.setId(2);
        user.setName("豹哥2");

        ZK_CLIENT.writeData(ZK_PATH, user);

        System.out.println("updateNode done.");
    }

    public void deleteNode() {
        // 删除单独一个节点，返回true表示成功
        boolean r = ZK_CLIENT.delete(ZK_PATH);
        System.out.println("deleteNode, r:" + r);
    }

    public static void main(String[] args) {
        NodeManager nodeManager = new NodeManager();
        nodeManager.createNode();
        nodeManager.updateNode();
        nodeManager.deleteNode();
    }

}
