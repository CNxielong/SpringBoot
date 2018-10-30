package cn.xdl.controller;

import org.springframework.boot.autoconfigure.web.BasicErrorController;
import org.springframework.boot.autoconfigure.web.ErrorAttributes;
import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.boot.autoconfigure.web.ErrorProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 
 * @Title: MyErrorController  
 * @Description: TODO(自定义个ErrorController组件，提供/error)  
 * @author X-Dragon  
 * @date 2018年10月29日 下午2:40:55 
 * @version V1.0  
 *
 */
@Controller //不能丢 否则默认采取原先的BasicErrorController
public class MyErrorController implements ErrorController {

	@Override
	public String getErrorPath() {
		return "/error"; //这一行固定写法不能改
//		return "/exception";//如果用这一行 启动报错
	}
	
	@RequestMapping("error")
	public ModelAndView handlerException(){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("exception");
		mav.getModel().put("msg", "这是自定义的异常");
		return mav;
	}
	

}
