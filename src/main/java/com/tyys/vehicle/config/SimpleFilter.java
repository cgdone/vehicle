package com.tyys.vehicle.config;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.tyys.vehicle.VehicleApplication;

@Component
public class SimpleFilter implements Filter {
	@Override
	public void destroy() {
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterchain)
			throws IOException, ServletException {

		System.out.println("Remote Host:" + request.getRemoteHost());
		System.out.println("Remote Address:" + request.getRemoteAddr());
		filterchain.doFilter(request, response);
	}

	@Override
	public void init(FilterConfig filterconfig) throws ServletException {
		
		Logger logger = VehicleApplication.getLogger();
		logger.info("this is a info message111");
		
	}
}