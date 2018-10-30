package cn.xdl.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class HandlerException {

	@ExceptionHandler//所有Controller都需要
	public ModelAndView handlerException(Exception e){
	    ModelAndView mav = new ModelAndView();
	    mav.setViewName("/exception");//exception.jsp
	    mav.getModel().put("error", "EmpController错误消息"+e);
	    return mav;
	}
	
}
