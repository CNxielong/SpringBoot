package cn.xdl.dao.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ConfigurableApplicationContext;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import cn.xdl.MyBootApplication;
import cn.xdl.dao.DeptDao;
import cn.xdl.entity.Dept;

@RunWith(SpringRunner.class)//Spring结合的引擎
@SpringBootTest(classes={MyBootApplication.class})//注明是哪个类的测试类
public class TestDao {
	
	public static ConfigurableApplicationContext ac = SpringApplication.run(MyBootApplication.class);
	@Autowired
	private DeptDao deptDao;

	public static void main(String[] args) {
//		DeptDao deptDao = ac.getBean("deptDao", DeptDao.class);
		DeptDao deptDao = ac.getBean(DeptDao.class, "deptDao");
		List<Dept> queryAll = deptDao.queryAll();
		for (Dept dept : queryAll) {
			System.out.println(dept);
		}
	}
	
	@Test
	public void Test1(){
//		DeptDao deptDao = ac.getBean("deptDao", DeptDao.class);
		DeptDao deptDao = ac.getBean(DeptDao.class, "deptDao");
		Dept dno = deptDao.selectByDno(10);
		System.out.println(dno);
	}
	
	@Test
	public void test2(){
		Dept dept = new Dept(12,"12","12dcity");
		System.out.println(deptDao);
		int res = deptDao.addDept(dept);
		System.out.println(res);
	}
	
	@Test
	public void test3(){
		Dept dept = new Dept();
		dept.setDcity("9thCity");
		dept.setDname("9Name");
		dept.setDno(9);
		int res = deptDao.updateDept(dept);
		System.out.println(res);
	}
	
	@Test
	public void test4(){
		Dept dept = new Dept();
		dept.setDcity("18City");
		dept.setDname("18Name");
		dept.setDno(200);//插入的不是200 是dept_seq.nextval的值
		int res = deptDao.addDept(dept);
		Dept dept2 = deptDao.selectByDno(200);
		System.out.println("插入了"+res+"个数据");
		System.out.println("200号的DEPT:"+dept2);
		System.out.println("插入的主键值是:"+dept.getDno());
	}
	
	@Test
	public void test5(){
		int res = deptDao.deleteDept(18);
		System.out.println(res);
	}
}
