package com.dubbo.provider;

import com.dubbo.api.UserService;

public class UserServiceImpl implements UserService {
    public String sayHi(String s) {
        return "hello " + s + "!";
    }
}