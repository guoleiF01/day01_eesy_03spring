package com.itheima.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *  模拟一个表现层，用于调用业务逻辑层
 */
public class Client {
    /**
     * 获取sping容器的IOC核心容器，并根据id获取对象。
     * @param args
     */
    public static void main(String[] args) {
        //1 获取核心容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        //2根据id获取bean对象

    }
}
