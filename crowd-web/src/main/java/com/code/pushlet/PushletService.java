package com.code.pushlet;


import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import org.springframework.stereotype.Component;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;


@Component
public class PushletService extends HttpServlet{
	
	private static final long serialVersionUID = -4243528775800065730L;
	
	{
		//WebApplicationContext	applicationContext = ContextLoaderListener.getCurrentWebApplicationContext();
	}
	
	
    public void init(ServletConfig config) throws ServletException{
        SpringBeanAutowiringSupport.processInjectionBasedOnServletContext(this,config.getServletContext());
        
    }
}
