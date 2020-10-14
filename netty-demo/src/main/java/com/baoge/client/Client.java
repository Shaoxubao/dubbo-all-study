package com.baoge.client;

import org.jboss.netty.bootstrap.ClientBootstrap;
import org.jboss.netty.channel.ChannelFactory;
import org.jboss.netty.channel.ChannelPipeline;
import org.jboss.netty.channel.ChannelPipelineFactory;
import org.jboss.netty.channel.Channels;
import org.jboss.netty.channel.socket.nio.NioClientSocketChannelFactory;
import org.jboss.netty.handler.codec.string.StringDecoder;
import org.jboss.netty.handler.codec.string.StringEncoder;

import java.net.InetSocketAddress;
import java.util.concurrent.Executors;

/**
 * Copyright 2018-2028 Baoge All Rights Reserved.
 * Author: Shao Xu Bao <xubao_shao@163.com>
 * Date:   2020/10/14
 */
public class Client {

    public static void main(String[] args) {
        // 同服务端相同，只是这里使用的是NioClientSocketChannelFactory
        final ChannelFactory factory = new NioClientSocketChannelFactory(
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool(),
                8);

        // ClientBootstrap用于帮助客户端启动
        ClientBootstrap bootstrap = new ClientBootstrap(factory);
        // 由于客户端不包含ServerSocketChannel，所以参数名不能带有child.前缀
        bootstrap.setOption("tcpNoDelay", true);
//      bootstrap.setOption("keepAlive", true);

        //设置管道工厂，里面也设置了编解码
        bootstrap.setPipelineFactory(new ChannelPipelineFactory() {
            @Override
            public ChannelPipeline getPipeline() throws Exception {
                ChannelPipeline channelPipeline = Channels.pipeline();
                channelPipeline.addLast("decoder", new StringDecoder());
                channelPipeline.addLast("encoder", new StringEncoder());
                channelPipeline.addLast("handler", new ClientLogicHandler());
                return channelPipeline;
            }
        });

        // 这里连接服务端绑定的IP和端口  ，连接服务端
        bootstrap.connect(new InetSocketAddress("127.0.0.1", 8000));
        System.out.println("Client is started...");
    }
}

