package cn.xdl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping("/hello.do")
	public ModelAndView say(){
		ModelAndView mv = new ModelAndView();
		mv.setViewName("hello");
		mv.getModel().put("msg", "Hello SpringBoot MVC!");
		return mv;
	}
	
	
}
