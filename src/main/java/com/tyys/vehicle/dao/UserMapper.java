package com.tyys.vehicle.dao;

import java.util.List;

import org.apache.ibatis.annotations.*;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tyys.vehicle.entity.UserEntity;


public interface UserMapper {

    @Select("SELECT * FROM user")
    @Results({
        @Result(property = "id",  column = "user_id"),
        @Result(property = "userName", column = "user_name")
    })
    List<UserEntity> getAll();

    @Select("SELECT * FROM users WHERE user_id = #{id}")
    @Results({
    	@Result(property = "id",  column = "user_id"),
        @Result(property = "userName", column = "user_name")
    })
    UserEntity getOne(int userId);

    @Insert("INSERT INTO user(user_id,user_name,user_status) VALUES(#{user_id}, #{user_name}, #{user_status})")
    void insert(UserEntity user);

    @Update("UPDATE user SET user_name=#{userName} WHERE id =#{id}")
    void update(UserEntity user);

    @Delete("DELETE FROM users WHERE id =#{id}")
    void delete(Long id);
}