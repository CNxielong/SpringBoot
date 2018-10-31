package cn.xdl.boot.service;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

//@WebFilter(servletNames={"myservlet"})//指定要拦截的请求名称
//@WebFilter(urlPatterns={"/myservlet.do"})//制定拦截器请求路径 这两种都行
@WebFilter(urlPatterns={"/myservlet1"})//监听 MyServlet1
public class MyFilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("初始化过滤器");
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		response.setCharacterEncoding("UTF-8");
		chain.doFilter(request, response);
		System.out.println("--执行Filter--");
		
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("Filter destory");
	}

}
