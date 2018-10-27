package cn.xdl.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component("dB2")
//@ConfigurationProperties//注入参数
@ConfigurationProperties(prefix="db")//注入参数
public class DB {
	
//	@Value("${username}")
	private String username;
//	@Value("${password}")
	private String password;
	
	public DB() {
		super();
	}
//	public DB(String username, String password) {
//		super();
//		this.username = username;
//		this.password = password;
//	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
