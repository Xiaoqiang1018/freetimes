package com.house.dao.service;

import com.house.pojo.User;

public interface UserService {
    User getPasswordByName(String name);
}
