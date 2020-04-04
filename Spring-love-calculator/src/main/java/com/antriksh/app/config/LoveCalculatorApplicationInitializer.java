package com.antriksh.app.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class LoveCalculatorApplicationInitializer// implements WebApplicationInitializer
{

	public void onStartup(ServletContext servletContext) throws ServletException {
		System.out.println("my custom class onstartup ");

		AnnotationConfigWebApplicationContext webApplicationContext = new AnnotationConfigWebApplicationContext();
		webApplicationContext.register(LoveCalculatorAppConfig.class);

		// create a dispatcher servlet object to initialze the webapplicationcontext
		DispatcherServlet dispatcherServlet = new DispatcherServlet(webApplicationContext);

		// Registered Dispatcher Servlet with Servlet context
		ServletRegistration.Dynamic myCustomDispatcherServvlet = servletContext.addServlet("myDispatcherServlet",
				dispatcherServlet);
		myCustomDispatcherServvlet.setLoadOnStartup(1);
		myCustomDispatcherServvlet.addMapping("/mywebsite.com/*");

	}
}
