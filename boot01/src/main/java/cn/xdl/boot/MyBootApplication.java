package cn.xdl.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * 
 * @Title: MyBootApplication  
 * @Description: TODO(SpringBoot初始化DEMO)  
 * @author X-Dragon  
 * @date 2018年10月20日 下午11:55:11 
 * @version V1.0  
 *
 */
@SpringBootApplication
public class MyBootApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(MyBootApplication.class, args);
		System.out.println("主启动类");
	}

}
