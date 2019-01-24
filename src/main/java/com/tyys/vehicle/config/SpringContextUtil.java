package com.tyys.vehicle.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Configuration;

import com.tyys.vehicle.VehicleApplication;

@Configuration
public class SpringContextUtil {
    
  //定义一个全局的记录器，通过LoggerFactory获取
    private final static Logger logger = LoggerFactory.getLogger(VehicleApplication.class); 
 
 /*   @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        SpringContextUtil.applicationContext = applicationContext;
    }
 
    public static ApplicationContext getCtx() {
        return SpringContextUtil.applicationContext;
    }
    */

    public static Logger getLogger() {
        return SpringContextUtil.logger;
    } 
}
