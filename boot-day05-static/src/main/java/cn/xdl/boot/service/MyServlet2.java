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

@WebServlet(urlPatterns="/cancle.do")
public class MyServlet2 extends HttpServlet{

	public void service(
		HttpServletRequest request,HttpServletResponse response) throws IOException{
		
		request.getSession().invalidate();//销毁session
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		Integer count = (Integer)request.getServletContext().getAttribute("count");
		out.println("<h2>退出成功,在线用户数量："+count+"</h2>");
		out.close();
	}
	
}
