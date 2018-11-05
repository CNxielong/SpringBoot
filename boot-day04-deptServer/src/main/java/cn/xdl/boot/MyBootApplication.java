package cn.xdl.boot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@MapperScan(basePackages={"cn.xdl.boot.dao"})//接口文件类没有标注需要制定包名
@ServletComponentScan//带@标记组件的不需要指定包名
public class MyBootApplication {
	public static void main(String[] args) {
		SpringApplication.run(MyBootApplication.class, args);
		System.out.println("服务器端:8888启动");
	}
}
