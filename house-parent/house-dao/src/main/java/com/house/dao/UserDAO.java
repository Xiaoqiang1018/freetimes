package com.house.dao;

import com.house.pojo.User;

public interface UserDAO {
    User getPasswordByName(String name);
}
