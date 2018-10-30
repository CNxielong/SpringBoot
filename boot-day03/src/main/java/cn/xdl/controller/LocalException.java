package cn.xdl.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LocalException {
	
	@RequestMapping("/localException.do")
	public String local(){
		String[] s = null;
		System.out.println(s.length);//抛出异常 下文接收
		return "mav";//执行不到
	}

	@ExceptionHandler //这个只会处理本Controller内部的局部异常
	public ModelAndView localException(Exception e){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("error1");//异常页面不能用error命名 
		mav.getModel().put("exception", "异常信息是:"+e);
		return mav;
	}
	
}
