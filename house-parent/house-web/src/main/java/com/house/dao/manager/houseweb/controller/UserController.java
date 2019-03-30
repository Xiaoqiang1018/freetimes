package com.house.dao.manager.houseweb.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.house.pojo.User;
import com.house.dao.service.UserService;
import com.house.pojo.ResponseTO;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class UserController {

    @Reference
    private UserService userService;

    @RequestMapping("/user/{name}/{password}")
    public ResponseTO login(HttpSession session, @PathVariable("name") String name, @PathVariable("password") String password) {
        User passwordByName = userService.getPasswordByName(name);
        System.out.println("name" + name + "   " + "password" + password);
        if (passwordByName == null || !passwordByName.getPassword().equals(password)) {
            return new ResponseTO(true, "用户名或密码错误");

        }
        session.setAttribute("user", passwordByName);
        return new ResponseTO(true, "登陆成功");
    }

}
