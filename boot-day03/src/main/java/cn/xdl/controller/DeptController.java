package cn.xdl.controller;

import java.lang.ProcessBuilder.Redirect;
import java.util.List;

import org.jboss.logging.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import cn.xdl.dao.DeptDao;
import cn.xdl.entity.Dept;

@Controller
@RequestMapping("/dept")
public class DeptController {
	
	@Autowired
	DeptDao deptdao;

	@RequestMapping("/list.do")
	public ModelAndView list(){
		ModelAndView mav = new ModelAndView();
		List<Dept> list = deptdao.queryAll();
		mav.setViewName("deptList");
		mav.getModel().put("deptList", list);
		return mav;
	}
	
	@RequestMapping("/delete.do")//最简洁的写法
//	@RequestMapping("/delete.do")//  对应 JSP http://localhost:8888/delete.do?dno=${dept.dno}
	public String deleteByDno(@RequestParam("dno") int dno){
		deptdao.deleteDept(dno);
		return "redirect:/dept/list.do";
	}
	
//	@RequestMapping("/dept/delete.do") //这种方式删除后展现为空结果的
//	public ModelAndView deleteByDno(@RequestParam("dno") int dno){
//		ModelAndView mav = new ModelAndView();
//		deptdao.deleteDept(dno);
//		mav.setViewName("deptList");
//		return mav;
//	}
	
//	@RequestMapping("/dept/delete.do") //这种方式删除后重定向
//	public ModelAndView deleteByDno(@RequestParam("dno") int dno){
//		ModelAndView mav = new ModelAndView();
//		deptdao.deleteDept(dno);
//		RedirectView view = new RedirectView("/dept/list.do");
//		mav.setView(view);
//		return mav;
//	}
	
}
