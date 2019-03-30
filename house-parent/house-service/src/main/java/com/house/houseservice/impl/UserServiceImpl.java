package com.house.houseservice.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.house.dao.UserDAO;
import com.house.pojo.User;
import com.house.dao.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

@Service(timeout = 30000)
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDAO userDAO;

    @Override
    public User getPasswordByName(String name) {
        return userDAO.getPasswordByName(name);
    }
}
