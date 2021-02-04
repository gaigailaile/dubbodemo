package com.gai.service.impl;

//import com.gai.service.UserService;

import com.gai.service.UserService;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UserServiceImpl implements UserService {
    public String getUser(Integer id) {
        System.out.println(new SimpleDateFormat("YYYY-mm-dd HH:mm:ss").format(new Date()) +
                " :客户端有人来消费了....");
        if (id == 1) {
            return "盖东旭";
        }
        if (id == 2) {
            return "杨慧";
        }
        return "没有找到";
    }
}
