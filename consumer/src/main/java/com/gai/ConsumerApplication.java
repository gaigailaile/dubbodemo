package com.gai;

import com.gai.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class ConsumerApplication {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("dubbo-consumer.xml");
        UserService userService = (UserService) app.getBean("userService");
        String name = userService.getUser(1);
        System.out.println("name:" + name);
    }
}
