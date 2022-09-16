package com.kartService.servlets;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kartService.services.FoodKartMainService;

public class MainServlet extends HttpServlet {
	@Override
	public void init(ServletConfig servletconfig)
		    throws ServletException {
		System.out.println("Kart Service Initiated ........ ");
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/kartService/spring/resources/conf/spring.xml");
		FoodKartMainService service = (FoodKartMainService) ac.getBean("main");

    	service.runService();
	}

}
