package cn.xdl.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import cn.xdl.dao.BookDao;
import cn.xdl.dao.UserDao;


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
	    ApplicationContext ac = 
	            SpringApplication.run(DaoConfig.class, args);
	        UserDao userDao = ac.getBean("userDao",UserDao.class);
	        userDao.save();
	        BookDao bookDao = ac.getBean("bookDao",BookDao.class);
	        bookDao.load();
	}

}
