package com.baoge;

import org.I0Itec.zkclient.IZkDataListener;
import org.I0Itec.zkclient.ZkClient;

/**
 * Copyright 2018-2028 Baoge All Rights Reserved.
 * Author: Shao Xu Bao <xubao_shao@163.com>
 * Date:   2020/10/14
 *
 * 订阅节点的数据内容的变化
 */
public class SubscribeDataChanges {

    private static final String ZK_PATH = "/baoge6";

    private static class ZKDataListener implements IZkDataListener {

        public void handleDataChange(String dataPath, Object data) throws Exception {
            System.out.println("handleDataChange dataPath:" + dataPath + "：" + data.toString());
        }

        public void handleDataDeleted(String dataPath) throws Exception {
            System.out.println("handleDataDeleted dataPath:" + dataPath);
        }
    }

    public static void main(String[] args) throws Exception {
        ZkClient zkClient = CreateSession.connectZK();
        zkClient.subscribeDataChanges(ZK_PATH, new ZKDataListener());

        Thread.sleep(Integer.MAX_VALUE);
    }

}
