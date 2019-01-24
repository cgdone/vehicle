package com.tyys.vehicle.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;

import com.tyys.vehicle.entity.User;

@Mapper
public interface User2Mapper {
	
	
	@Results({
		@Result(property = "user_id", column = "user_id", id = true),
		@Result(property = "userType",column = "user_type"),
		@Result(property = "createrID",column = "creater_id"),
		@Result(property = "createTime",column = "create_time")
	})
	@Select("select * from user")
	List<User> list();
	
	@Results({
		@Result(property = "user_id", column = "user_id", id = true),
		@Result(property = "userType",column = "user_type"),
		@Result(property = "createrID",column = "creater_id"),
		@Result(property = "createTime",column = "create_time")
	})
	@Select("select * from user where user_name like #{userName} ")
	List<User> getUserByName(@Param("userName") String userName);
	



	@SelectProvider(type = UserSqlProvider.class, method = "getBadUser")
    User getBadUser(@Param("username") String username, @Param("password") String password);
}
