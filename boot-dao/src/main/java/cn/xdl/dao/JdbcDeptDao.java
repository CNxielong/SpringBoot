package cn.xdl.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.validation.BeanPropertyBindingResult;

import cn.xdl.entity.Dept;

/**
 * 
 * @Title: JdbcDeptDao  
 * @Description: TODO(JdbcDeptDao接口实现类)  
 * @author X-Dragon  
 * @date 2018年10月28日 上午12:36:47 
 * @version V1.0  
 *
 */

@Repository
public class JdbcDeptDao implements DeptDao {

	@Autowired //由JdbcTemplateConfig注入
	@Qualifier("template1") // 制定注入的参数类型
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public List<Dept> queryAll() {
		String sql = "select * from xdl_dept";
		BeanPropertyRowMapper<Dept> mapper = new BeanPropertyRowMapper<Dept>(Dept.class);//新建映射
		List<Dept> list = jdbcTemplate.query(sql, mapper);
		return list;
	}

}
