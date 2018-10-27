package cn.xdl.config;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import cn.xdl.service.UserService;

@ComponentScan(basePackages="cn.xdl.service")//扫描 cn.xdl.service包下的代码
//@ComponentScan //什么都不加默认扫描
public class ComponentScanConfig {

	public static void main(String[] args) {
		ConfigurableApplicationContext ac = SpringApplication.run(ComponentScanConfig.class, args);
		UserService bean = ac.getBean("UserService", UserService.class);
		bean.register();
	}
	
}
