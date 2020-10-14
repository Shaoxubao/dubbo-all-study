package com.baoge;

import org.I0Itec.zkclient.IZkStateListener;
import org.I0Itec.zkclient.ZkClient;
import org.I0Itec.zkclient.serialize.SerializableSerializer;
import org.apache.zookeeper.Watcher;

/**
 * Copyright 2018-2028 Baoge All Rights Reserved.
 * Author: Shao Xu Bao <xubao_shao@163.com>
 * Date:   2020/10/14
 */
public class CreateSession {

    public static ZkClient connectZK() {

        // 集群地址
        String zkServers = "127.0.0.1:2181";

        ZkClient zkClient = new ZkClient(zkServers, 10000, 10000, new SerializableSerializer());
        zkClient.subscribeStateChanges(new IZkStateListener() {
            public void handleStateChanged(Watcher.Event.KeeperState keeperState) throws Exception {
                System.out.println("handleStateChanged, keeperState:" + keeperState);
            }

            public void handleNewSession() throws Exception {
                System.out.println("handleNewSession");
            }
        });

        System.out.println("zk connect ok!");
        return zkClient;
    }

}
