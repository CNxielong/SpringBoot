package cn.xdl.boot.service;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener
public class MyListener implements ServletContextListener, HttpSessionListener {

	ServletContext application;

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		application = sce.getServletContext();
		application.setAttribute("count", 0);
		System.out.println("监听初始化");
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		application = sce.getServletContext();
		Integer count = (Integer) application.getAttribute("count");
		System.out.println("监听销毁");
	}

	@Override
	public void sessionCreated(HttpSessionEvent se) {
		Integer count = (Integer) application.getAttribute("count");
		count++;
		application.setAttribute("count", count);
		System.out.println("session初始化");
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
		Integer count = (Integer) application.getAttribute("count");
		if (count > -1) {
			count--;
		}
		application.setAttribute("count", count);
		System.out.println("sessionDestroyed");
	}

}
