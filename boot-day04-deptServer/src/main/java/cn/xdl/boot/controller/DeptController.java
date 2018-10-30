package cn.xdl.boot.controller;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.annotations.Param;
import org.mockito.internal.invocation.realmethod.RealMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import cn.xdl.boot.dao.DeptDao;
import cn.xdl.boot.entity.Dept;

@RestController//搭配Rest
public class DeptController {

    @Autowired//Spring标注
//	@Resource//也可以 JAVA原生的标注
    private DeptDao deptDao;

    @RequestMapping(value="/dept",method=RequestMethod.GET)
    public List<Dept> loadAll(){
    	System.out.println("--loadAll()--");
        return deptDao.selectAll();
    }

    @RequestMapping(value="/dept",method=RequestMethod.POST)
    public int add(Dept dept){
    	 System.out.println("Add Dept");
         return deptDao.addDept(dept);
    }

    @RequestMapping(value="/dept/{id}",method=RequestMethod.GET)
    public Dept load(@PathVariable("id")int id){
    	System.out.println("selectDeptByDno"+id);
        return deptDao.selectDeptByDno(id);
    }

    @RequestMapping(value="/dept/{id}",method=RequestMethod.DELETE)
    public int delete(@PathVariable("id")int id){
    	System.out.println("delete删除方法"+id);
        return deptDao.deleteDept(id);
    }

    @RequestMapping(value="/dept/{id}",method=RequestMethod.PUT)
    public int update(Dept dept){
    	System.out.println("updateDept:"+dept);
        return deptDao.updateDept(dept);
    }
}


//public class DeptController {
//
//	@Autowired
////	@Resource
//	private DeptDao deptDao;
//	
//	@RequestMapping(value="/dept/all",method=RequestMethod.GET)
//	public List<Dept> queryAll(){
//		System.out.println("Dao:"+deptDao);
//		List<Dept> list = deptDao.selectAll();
//		return list;
//	}
//	
////	@RequestMapping("/dept/{dno}")
//	@RequestMapping(value="/dept/{dno}",method=RequestMethod.GET)
//	public Dept queryOneDept(@PathVariable("dno")int dno){//controller 对应web@PathVariable
//		System.out.println("Dao:"+deptDao);
//		Dept dept = deptDao.selectDeptByDno(dno);
//		return dept;
//	}
//	
//	@RequestMapping(value="/dept/delete/{dno}",method=RequestMethod.DELETE)
//	public int deleteDeptByDno(@PathVariable("dno")int dno){//controller 对应web@PathVariable
//		int i = deptDao.deleteDept(dno);
//		System.out.println("删除了"+i+"个部门");
//		return i;
//	}
//	
//}
