package com.gai;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class ProviderApplication2 {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("dubbo-provider.xml");
        context.start();
//        System.out.println("会员启动成功... port:20880");
        System.out.println("会员启动成功... port:20881");
        System.in.read();  //服务一直保持运行
    }
}
