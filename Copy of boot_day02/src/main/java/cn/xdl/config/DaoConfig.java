package cn.xdl.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
//import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import cn.xdl.dao.BookDao;
import cn.xdl.dao.BookDaoImpl;
import cn.xdl.dao.UserDao;
import cn.xdl.dao.UserDaoImpl;

// @EnableAutoConfiguration//正常
@Configuration //报错 
public class DaoConfig {

	@Bean(name="userDao")
	public UserDao createUserDao(){
		return new UserDaoImpl();
	}
	@Bean(name="bookDao")
	public BookDao createBookDao(){
		return new BookDaoImpl();
	}
}
