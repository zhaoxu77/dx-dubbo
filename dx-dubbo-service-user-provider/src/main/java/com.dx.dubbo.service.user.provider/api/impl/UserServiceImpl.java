package com.dx.dubbo.service.user.provider.api.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.dx.dubbo.service.user.api.UserService;
import org.springframework.beans.factory.annotation.Value;

/**
 * ${DESCRIPTION}
 *
 * @author
 * @create 2019-01-29 13:26
 **/
@Service(version = "${user.service.version}")
public class UserServiceImpl implements UserService {

    @Value("${dubbo.protocol.port}")
    private String port;

    @Override
    public String sayHi() {
        return "Hello Dubbo , i am from port:" + port;
    }
}
