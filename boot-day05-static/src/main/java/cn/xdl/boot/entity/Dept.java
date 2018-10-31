package cn.xdl.boot.entity;

import java.io.Serializable;

public class Dept implements Serializable{
	
	/**
	 * serialVersionUID
	 */  
	private static final long serialVersionUID = -3556097193063563342L;
	
	private Integer dno;
	private String dname;
	private String dcity;
	
	public Dept() {
		super();
	}
	public Dept(Integer dno, String dname, String dcity) {
		super();
		this.dno = dno;
		this.dname = dname;
		this.dcity = dcity;
	}
	public Integer getDno() {
		return dno;
	}
	public void setDno(Integer dno) {
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
