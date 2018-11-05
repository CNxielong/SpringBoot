package cn.boot.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @Title: Controller  
 * @Description: TODO(区分@PathVariable和@RequestParam)  
 * @author X-Dragon  
 * @version V1.0  
 *
 */
@RestController
public class DifferentiatedAnnotationController {
	
	/**
	 * http://localhost:8888/boot/pathVariable/bigsea
	 * http://localhost:8888/boot/pathVariable/sea
	 * http://localhost:8888/boot/pathVariable?name=xielong报错
	 * 这些URL 都会 执行此方法 并且将  <b>bigsea</b>、<b>sea</b> 作为参数 传递到name字段
	 * @param name
	 * @return
	 */
	@RequestMapping("/pathVariable/{name}")
	public String pathVariable(@PathVariable("name")String name){
		System.out.println("hello "+name); //在控制台打印
		return "helloworld"+"/@pathVariable/"+name;//在页面上打印出来
	}

	/**
	 * http://localhost:8888/boot/requestParam?firstName=big&lastName=sea
	 * http://localhost:8888/boot/requestParam?lastName=sea&age=23
	 * http://localhost:8888/boot/requestParam 报错
	 * 如果 required = true 则表示请求参数对应的 字段 必须存在.如果不存在则会抛出异常<br/>
	 * @param firstName 可以为null
	 * @param lastName 不能为null .为null报异常
	 * @param age age字段表示如果没有 age 参数 则默认值为 0 
	 * @return
	 */
	@RequestMapping("/requestParam")
	public String requestParam(@RequestParam(value="firstName",required=false)String firstName,
			@RequestParam( value="lastName" ,required = true) String lastName,
			@RequestParam(value="age",required = false ,defaultValue="0")int age) {
		System.out.println("hello my name is " + (firstName == null ? "" : firstName)
										+ lastName + "," + age +" years old this year");
		return "helloworld"+"/@RequestParam";
	}

}
