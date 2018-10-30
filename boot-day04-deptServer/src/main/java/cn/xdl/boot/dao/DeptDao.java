package cn.xdl.boot.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import cn.xdl.boot.entity.Dept;

public interface DeptDao {

	@Select("SELECT * FROM DEPT")
	List<Dept> selectAll();
	
	@Select("SELECT * FROM DEPT WHERE DNO=#{DNO}")
	Dept selectDeptByDno(int dno);
	
	@Insert("INSERT INTO DEPT (DNO,DNAME,DCITY) VALUES(#{DNO},#{DNAME},#{DCITY})")
	int addDept(Dept dept);
	
	@Delete("DELETE FROM DEPT WHERE DNO=#{DNO}")
//	int deleteDept(@Param("id") int dno);//报错org.apache.ibatis.binding.BindingException: Parameter 'DNO' not found. Available parameters are [id, param1]
//	int deleteDept(@Param("dno") int dno);//报错 注意 大小写要匹配
//	int deleteDept(int dno);//正常
	int deleteDept(@Param("DNO") int no);//正常
	
	@Update("UPDATE DEPT SET DNO=#{DNO},DNAME=#{DNAME},DCITY=#{DCITY}")
	int updateDept(Dept dept);
	
	@Update("UPDATE DEPT SET DNO=#{DNO},DNAME=#{DNAME}")
	int updateDeptName(@Param("dno")int id, @Param("dname")int name);
	
}
