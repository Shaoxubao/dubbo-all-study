package com.baoge;

import com.baoge.command.Command;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * Copyright 2018-2028 Baoge All Rights Reserved.
 * Author: Shao Xu Bao <xubao_shao@163.com>
 * Date:   2020/10/12
 *
 * spi的设计目标：
 * 面向对象的设计理念，模块之间基于接口编程，模块之间不对实现进行硬编码。
 * 一旦代码里设计具体的实现类，就违反了可拔插的原则，如果需要替换一种实现，就需要修改代码。
 * 为了实现在模块装配的时候，不在模块里写死代码，这就需要一种服务发现机制。
 * Java SPI就是提供这样的一个机制：
 * 为某个接口寻找服务实现的机制，有点类似IOC的思想，就是将装配的控制权移到代码之外。
 *
 * JDK SPI具体约定如下：
 * 当服务提供者(provider)，提供了一个接口多种实现时，
 * 一般会在jar包的META-INF/services/目录下，创建该接口的同名文件，
 * 该文件里面的内容就是该服务接口的具体实现类的名称，
 * 而当外部加载这个模块的时候，就能通过该
 * jar包的META-INF/services/里的配置文件得到具体的实现类名，并加载实例化，完成模块的装配。
 *
 * Dubbo为什么不采用JDK的SPI？
 * JDK标准的SPI会一次性加载实例化扩展点所有实现，如果有扩展实现初始化很耗时，
 * 但如果没用上也加载，会很浪费资源。
 * Dubbo增加了对扩展点IOC和AOP的支持，一个扩展点可以直接setter注入到其他扩展点。
 */
public class Main {
    public static void main(String[] args) {

        // JDK SPI

        // 1. 获取 ServiceLoader
        ServiceLoader<Command> serviceLoader = ServiceLoader.load(Command.class);

        for (Command command : serviceLoader) {
            command.execute();
        }

        // 或者如下方式:
        // 2. 获取迭代器
        Iterator<Command> iterator = serviceLoader.iterator();
        // 3. 迭代读取实现类 调用 hasNext 方法的时候会去加载配置文件进行解析
        while (iterator.hasNext()) {
            // 调用 next 方法的时候进行实例化并缓存
            Command command = iterator.next();
            // 4. 执行实现类
            command.execute();
        }

    }
}
