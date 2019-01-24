package com.tyys.vehicle.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tyys.vehicle.dao.User2Mapper;
import com.tyys.vehicle.dao.UserMapper;
import com.tyys.vehicle.entity.User;

@RestController
@RequestMapping("/user2")
public class User2Controller {

    @SuppressWarnings("all")
    @Autowired
    User2Mapper userMapper;

    @RequestMapping("list")
    public List<User> list() {
        return userMapper.list();
    }

   @GetMapping("list/{userName}")
    public List<User> listByUserName(@PathVariable("userName") String userName) {
        return userMapper.getUserByName(userName);
    }
   
 /*
    @GetMapping("get/{username}/{password}")
    public User get(@PathVariable("username") String username, @PathVariable("password") String password) {
        return userMapper.get(username, password);
    }*/

    @GetMapping("bad/{username}/{password}")
    public User getBadUser(@PathVariable("username") String username, @PathVariable("password") String password) {
        return userMapper.getBadUser(username, password);
    }

}