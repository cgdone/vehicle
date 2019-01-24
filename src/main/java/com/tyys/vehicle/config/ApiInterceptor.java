package com.tyys.vehicle.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.tyys.vehicle.VehicleApplication;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class ApiInterceptor implements HandlerInterceptor {

	private final static Logger logger = VehicleApplication.getLogger();

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {

		long startTime = System.currentTimeMillis();
		request.setAttribute("startTime", startTime);

		System.out.println("PreHandle ...");
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {

		long startTime = (Long) request.getAttribute("startTime");
		long endTime = System.currentTimeMillis();
		long executeTime = endTime - startTime;

		// modified the exisitng modelAndView
		//modelAndView.addObject("executeTime", executeTime);

		logger.info("[" + handler + "] executeTime : " + executeTime + "ms");

		System.out.println("postHandle...");

	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler,
			Exception exception) throws Exception {

		long startTime = (Long) request.getAttribute("startTime");
		long endTime = System.currentTimeMillis();
		long executeTime = endTime - startTime;

		logger.info("[" + handler + "] executeTime : " + executeTime + "ms");

		System.out.println("afterCompletion...");
	}
}
