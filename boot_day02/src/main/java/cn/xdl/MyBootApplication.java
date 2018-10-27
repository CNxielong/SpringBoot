package cn.xdl;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;

import cn.xdl.bean.DB;
import cn.xdl.config.DaoConfig;
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
	            SpringApplication.run(MyBootApplication.class, args);
	        UserDao userDao = ac.getBean("userDao",UserDao.class);//createUserDao
	        UserDao userDao1 = ac.getBean("userDao",UserDao.class);
	        userDao.save();
	        BookDao bookDao1 = ac.getBean("bookDao",BookDao.class);
//	        BookDao bookDao2 = ac.getBean("createBookDao",BookDao.class);
	        bookDao1.load();
	        System.out.println("userDao:"+userDao);  //userDao :cn.xdl.dao.UserDaoImpl@1d17b521 加了标注@Scope("prototype")//非单例
	        System.out.println("userDao1:"+userDao1);//userDao1:cn.xdl.dao.UserDaoImpl@7f749872
	        System.out.println("bookDao1:"+bookDao1);//bookDao1:cn.xdl.dao.BookDaoImpl@674e67271 没加标注@Scope("prototype")单例
//	        System.out.println("bookDao2:"+bookDao2);//bookDao2:cn.xdl.dao.BookDaoImpl@674e6727
	        
	        DataSource dataSource = ac.getBean("dbcp",DataSource.class);
//	        DataSource dataSource = ac.getBean("dataSourceConfig",DataSource.class);//得到dataSourceConfig
	        
		    System.out.println(dataSource);
		    
		    DB db = ac.getBean("dB2", DB.class);
		    System.out.println(db);
		    System.out.println("user:"+db.getUsername());
		    System.out.println("ps:"+db.getPassword());
	}

}
