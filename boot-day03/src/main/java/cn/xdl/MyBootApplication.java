package cn.xdl;

import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.github.pagehelper.PageHelper;

import cn.xdl.dao.DeptDao;
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
@MapperScan(basePackages = "cn.xdl.dao")
public class MyBootApplication {

	public static void main(String[] args) throws SQLException {
		ConfigurableApplicationContext ac = SpringApplication.run(MyBootApplication.class, args);
//		DeptDao deptDao = ac.getBean("deptDao", DeptDao.class);
//		PageHelper.startPage(1, 2);//顺序放在 结果集前面
//		List<Dept> list = deptDao.queryAll();
//		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
//			Dept dept = (Dept) iterator.next();
//			System.out.println(dept);
//		}
//		Dept dept = deptDao.selectByDno(10);
//		System.out.println(dept);
	}

}
