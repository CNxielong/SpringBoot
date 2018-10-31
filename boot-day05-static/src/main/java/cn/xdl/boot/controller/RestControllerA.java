package cn.xdl.boot.controller;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import cn.xdl.boot.entity.Dept;

@Controller
//@RestController
public class RestControllerA {//起名不能跟JAR包要引入的名称一致

	@Autowired//自动配置已经创建了该对象
	private RestTemplateBuilder templateBuilder;	

	
	@RequestMapping("/dept")
	public String dept(ModelMap model){
		RestTemplate restTemplate = templateBuilder.build();
		List<Dept> list = new ArrayList<Dept>();
//		调用服务器端 http://localhost:8888/deptList获取部门服务信息
		List<LinkedHashMap<String,Object>> forObject = restTemplate.getForObject("http://localhost:8888/dept", List.class);
//		get请求对应get 返回的是对象对应Object post请求对应post 返回的是链接对应url restTemplate.postForLocation(url, request);		
//		System.out.println("forObject类型:"+forObject.getClass());
//		Object obj = forObject.get(0);
//		System.out.println(obj);
//		System.out.println("obj类型:"+obj.getClass());
//		System.out.println("obj类型:"+obj.getClass().getName());//LinkedHashMap类型
		for (LinkedHashMap<String,Object> map : forObject) {
			list.add(new Dept((Integer)map.get("dno"), (String)map.get("dname"), (String)map.get("dcity")));
		}
		model.put("deptList", list);
		return "hello";//找到  application.properties下的 配置prefix suffix
		
	}
	
	
	@RequestMapping("/dept/beanUtils")//需要在MAVEN中引入beanUtils组件
	public String showDeptList(ModelMap model){
		System.out.println("进入了/dept");
		RestTemplate restTemplate = templateBuilder.build();
		System.out.println("restTemplate");
		List<Dept> list = new ArrayList<Dept>();
		//调用服务器端 http://localhost:8888/deptList获取部门服务信息
		List<LinkedHashMap<String,Object>> forObject = restTemplate.getForObject("http://localhost:8888/dept", List.class);
		//get请求对应get 返回的是对象对应Object post请求对应post 返回的是链接对应url restTemplate.postForLocation(url, request);		

		for (LinkedHashMap<String,Object> map : forObject) {
			Dept dept = new Dept();
			//将map对象信息封装成Dept对象
			try {
				BeanUtils.populate(dept, map);
			} catch (IllegalAccessException | InvocationTargetException e) {
				e.printStackTrace();
			}//map中的key和dept中的属性名一致
			list.add(dept);
			
		}
		model.put("deptList", list);
		return "hello";//找到  application.properties下的 配置prefix suffix
		
	}
	
}
