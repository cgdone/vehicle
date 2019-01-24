package com.tyys.vehicle.service;

import com.tyys.vehicle.entity.UserEntity;

public interface UserService {

    public UserEntity getUserById(int userId);
    boolean addUser(UserEntity record);
}