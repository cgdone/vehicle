package com.tyys.vehicle.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tyys.vehicle.dao.UserMapper;
import com.tyys.vehicle.entity.UserEntity;
import com.tyys.vehicle.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserMapper userMapper;
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/showUser2")	
	public String getUser() {		
		SimpleDateFormat df1 = new SimpleDateFormat("yyyyMM-dd HH:mm:ss");// 设置日期格式
		SimpleDateFormat df2 = new SimpleDateFormat("yyyyMMdd");// 设置日期格式
		SimpleDateFormat df3 = new SimpleDateFormat("HHmmss");// 设置日期格式

		String str1 = df1.format(new Date());// new Date()为获取当前系统时间
		String str2 = df2.format(new Date());
		String str3 = df3.format(new Date());

		Map<String, Object> result = new HashMap<String, Object>();

		result.put("str1", str1);
		result.put("str2", str2);
		result.put("str3", str3);

		return str1;
	}
	
	@RequestMapping("/getUsers")
	public List<UserEntity> getUsers() {
		List<UserEntity> users=userMapper.getAll();
		return users;
	}
	
	@RequestMapping("/newUser")
	public boolean newUser() {
		
		UserEntity user = new UserEntity();
		user.setId(4);
		user.setUserName("ddd");
		user.setUserStatus(12);
		boolean resutl=userService.addUser(user);
		return resutl;
	}
	
    @RequestMapping("/getUser")
    public UserEntity getUser(int id) {
    	UserEntity user=userMapper.getOne(id);
        return user;
    }
    
    @RequestMapping("/add")
    public void save(UserEntity user) {
    	userMapper.insert(user);
    }
    
    @RequestMapping(value="update")
    public void update(UserEntity user) {
    	userMapper.update(user);
    }
    
    @RequestMapping(value="/delete/{id}")
    public void delete(@PathVariable("id") Long id) {
    	userMapper.delete(id);
    }
    
    
}