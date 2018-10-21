package cn.xdl.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@RequestMapping("/hello/{name}")
	public String main(@PathVariable("name") String name){
		return "hello"+name;
	} 
}

//@Controller
//public class HelloController {
//
//	@RequestMapping("/hello.do")
//	@ResponseBody //将返回结果转换成JSON
//	public String say(){
//		return "hello";
//	}
//	
//}
