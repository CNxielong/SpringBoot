package cn.xdl.boot.service;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;//pom.xml导入

/**
 * 
 * @Title: MyServlet  
 * @Description: TODO(SpringBoot对JavaWeb支持 @WebServlet)  
 * @author X-Dragon  
 * @date 2018年10月31日 下午6:01:49 
 * @version V1.0  
 *
 */
//@WebServlet(name="webServlet")//可以
@WebServlet(urlPatterns={"/myservlet.do"},name="myservlet")//区分大小写
public class MyServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO 不设置编码格式中文乱码
	    request.setCharacterEncoding("utf-8");//请求编码
	    response.setCharacterEncoding("utf-8");//响应编码
	    response.setContentType("text/html;charset=utf-8");//设置响应编码类型

		String name = request.getParameter("name");
		PrintWriter out = response.getWriter();
		//pom.xml文件 引入了Apache Commons Lang » 3.4
		if(StringUtils.isNotBlank(name)){//非空
			out.println("Hello "+name);
		}else{//为空
			out.println("Hello 空字符串");
		}
		Integer count = (Integer)request.getServletContext().getAttribute("count");//只写这一行不会触发
		
		out.println("在线用户数"+count);
		out.close();
	}
	
}
