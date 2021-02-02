package com.gai.service.impl;

import com.gai.service.UserService;

public class UserServiceImpl implements UserService {
    public String getUser(Integer id) {
        System.out.println("客户端有人来消费了....");
        if (id == 1) {
            return "盖东旭";
        }
        if (id == 2) {
            return "杨慧";
        }
        return "没有找到";
    }
}
