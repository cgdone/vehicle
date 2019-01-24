package com.tyys.vehicle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.tyys.vehicle.config.SpringContextUtil;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
@MapperScan("com.tyys.vehicle.dao")

public class VehicleApplication {	
	
	//定义一个全局的记录器，通过LoggerFactory获取
    private final static Logger logger = LoggerFactory.getLogger(VehicleApplication.class); 

	public static void main(String[] args) {
		
		logger.info("this is a info message");
		logger.warn("this is a warn message");
		logger.error("this is a error message");
		
		SpringApplication.run(VehicleApplication.class, args);
		System.out.println("ok.");

	}
	
    public static Logger getLogger() {
        return logger;
    } 

}
