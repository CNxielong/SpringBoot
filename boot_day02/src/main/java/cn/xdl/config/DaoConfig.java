package cn.xdl.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
//import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Scope;

import cn.xdl.dao.BookDao;
import cn.xdl.dao.BookDaoImpl;
import cn.xdl.dao.UserDao;
import cn.xdl.dao.UserDaoImpl;

//@EnableAutoConfiguration
//@Import(cn.xdl.config.DataSourceConfig.class)
@Configuration //报错 注入失败
@Import(value=cn.xdl.config.DataSourceConfig.class)
public class DaoConfig {

	@Bean(name="userDao")
//	@Scope("prototype")//非单例
	public UserDao createUserDao(){
		return new UserDaoImpl();
	}

//	@Bean //默认是方法名 createBookDao
	@Bean("bookDao")
	public BookDao createBookDao(){
		return new BookDaoImpl();
	}
}
