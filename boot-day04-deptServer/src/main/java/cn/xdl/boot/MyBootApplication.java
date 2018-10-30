package cn.xdl.boot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@MapperScan(basePackages={"cn.xdl.boot.dao"})
public class MyBootApplication {
	public static void main(String[] args) {
		SpringApplication.run(MyBootApplication.class, args);
	}
}
