package cn.xdl.entity;

import java.io.Serializable;

/**
 * 
 * @Title: Dept  
 * @Description: TODO(封装实体对象)  
 * @author X-Dragon  
 * @date 2018年10月28日 上午12:03:59 
 * @version V1.0  
 *
 */
public class Dept implements Serializable {
	/**
	 * serialVersionUID
	 */  
	private static final long serialVersionUID = 4777153327882817666L;
	
	private int dno;
	private String dname;
	private String dcity;
	
	
	public Dept() {
		super();
	}
	
	public Dept(String dname, String dcity) {
		super();
		this.dname = dname;
		this.dcity = dcity;
	}

	public Dept(int dno, String dname, String dcity) {
		super();
		this.dno = dno;
		this.dname = dname;
		this.dcity = dcity;
	}
	public int getDno() {
		return dno;
	}
	public void setDno(int dno) {
		this.dno = dno;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getDcity() {
		return dcity;
	}
	public void setDcity(String dcity) {
		this.dcity = dcity;
	}
	@Override
	public String toString() {
		return "Dept [dno=" + dno + ", dname=" + dname + ", dcity=" + dcity + "]";
	}
	
}
