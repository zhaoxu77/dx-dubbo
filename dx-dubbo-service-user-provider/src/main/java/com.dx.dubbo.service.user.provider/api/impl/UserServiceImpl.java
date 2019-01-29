package com.dx.dubbo.service.user.provider.api.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.dx.dubbo.service.user.api.UserService;

/**
 * ${DESCRIPTION}
 *
 * @author
 * @create 2019-01-29 13:26
 **/
@Service(version = "${user.service.version}")
public class UserServiceImpl implements UserService {
    @Override
    public String sayHi() {
        return "Hello Dubbo";
    }
}
