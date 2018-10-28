package cn.xdl.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

import cn.xdl.entity.Dept;

public interface DeptDao {
	
	@Select("SELECT * FROM XDL_DEPT ORDER BY DNO")
	List<Dept> queryAll();
	
	@Select("SELECT * FROM XDL_DEPT where dno=#{dno}")
	Dept selectByDno(int dno);
	
//	@Insert("INSERT INTO XDL_DEPT(DNO,DNAME,DCITY) VALUES(dept_seq.nextval,#{dname},#{dcity})")
	@Insert("INSERT INTO XDL_DEPT(DNO,DNAME,DCITY) VALUES(#{dno},#{dname},#{dcity})")
	@SelectKey(before=true,statement="select dept_seq.nextval from dual",resultType=Integer.class,keyProperty="dno")
	int addDept(Dept dept);
	
	@Update("UPDATE  XDL_DEPT SET DNO=#{dno,jdbcType=INTEGER},DNAME=#{dname,jdbcType=VARCHAR},DCITY=#{dcity,jdbcType=VARCHAR} WHERE DNO=#{dno}")
	int updateDept(Dept dept);
	
	@Delete("DELETE FROM XDL_DEPT WHERE DNO=#{DNO}")
	int deleteDept(int dno);
	
}
