package cn.xdl.boot.controller;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import cn.xdl.boot.entity.Dept;

@Controller
public class HelloController {
	
	@RequestMapping("hello")
	public ModelAndView hello(){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("hello");
		mav.getModel().put("msg", "你好啊，李银河!");
		return mav;
	}
	
	@RequestMapping("deptList")
	public ModelAndView deptList(){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("hello");
		List<Dept> deptList = new LinkedList<Dept>();
		for (int i = 0; i < 10; i++) {
			deptList.add(new Dept(10+i,"dName"+i,"dCity"+i));
		}
		mav.getModel().put("deptList", deptList);
		return mav;
	}
	
}
