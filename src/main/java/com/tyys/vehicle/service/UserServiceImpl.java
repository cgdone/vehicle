package com.tyys.vehicle.service;

import javax.annotation.Resource;


import org.springframework.stereotype.Service;

import com.tyys.vehicle.dao.UserMapper;
import com.tyys.vehicle.entity.UserEntity;

@Service("UserService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userDao;


    public UserEntity getUserById(int userId) {
        return userDao.getOne(userId);
    }

    public boolean addUser(UserEntity record){
        boolean result = false;
        try {
            userDao.insert(record);
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }

}