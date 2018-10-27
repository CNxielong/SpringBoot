package cn.xdl;


import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import cn.xdl.config.DataSourceConfig;
import cn.xdl.dao.JdbcDeptDao;
import cn.xdl.entity.Dept;


/**
 * 
 * @Title: MyBootApplication  
 * @Description: TODO(JDBC JdbcTemplate主启动类)  
 * @author X-Dragon  
 * @date 2018年10月28日 上午12:36:07 
 * @version V1.0  
 *
 */
@SpringBootApplication
public class MyBootApplication {

		public static void main(String[] args) throws SQLException {
			ApplicationContext ac = SpringApplication.run(MyBootApplication.class, args);
//			DataSource dataSource = ac.getBean("dataSource", DataSource.class);
//			System.out.println(dataSource.getConnection());
			
			DataSource bean = ac.getBean("dbcp1", DataSource.class);
			System.out.println(bean);
			System.out.println(bean.getConnection());
			
//			DataSourceConfig bean = ac.getBean("dataSourceConfig", DataSourceConfig.class);
//			DataSource createDbcp1 = bean.createDbcp1();
//			System.out.println(createDbcp1.getConnection());
			
			JdbcDeptDao bean2 = ac.getBean("jdbcDeptDao", JdbcDeptDao.class);
			List<Dept> queryAll = bean2.queryAll();
			for (Dept dept : queryAll) {
				System.out.println(dept);
			}
			
		}	
}
