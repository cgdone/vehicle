package com.tyys.vehicle.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tyys.vehicle.VehicleApplication;

@RestController
public class HttpApiController {

	@Value("${server.port}")
	private String serverPort;

	// 定义一个全局的记录器，通过LoggerFactory获取
	private final static Logger logger = LoggerFactory.getLogger(VehicleApplication.class);

	@RequestMapping(value = "/test1")
	public String test1() {
		SimpleDateFormat df = new SimpleDateFormat("yyyyMM-dd HH:mm:ss");// 设置日期格式
		String str1 = df.format(new Date());// new Date()为获取当前系统时间
		str1 = "current time :" + str1;
		str1 += "<br>" + serverPort;

		logger.info("test1.....");

		return str1;

	}

	@RequestMapping(value = "/test2")
	public Map<String, Object> test2() {
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

		logger.info("test2.....");

		return result;

	}

	@RequestMapping("/test3")
	public Map<String, Object> getMap() {

		Map<String, Object> result = new HashMap<String, Object>();

		result.put("errorCode", "200");
		result.put("errorMsg", "成功");

		logger.info("test3.....");

		return result;

	}

	@RequestMapping(value= "test4",method = RequestMethod.GET)
	public int cal(@RequestParam("a") Integer a, @RequestParam("b") Integer b) {
		return a + b;
	}

	@RequestMapping("test5")
	public int listUser(@RequestParam("a") Integer a, @RequestParam("b") Integer b) {
		return a + b;
	}
}
