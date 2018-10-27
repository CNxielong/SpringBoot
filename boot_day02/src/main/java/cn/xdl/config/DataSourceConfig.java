package cn.xdl.config;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;

@EnableAutoConfiguration
public class DataSourceConfig {
	
	@Bean(name="dbcp")
	public DataSource createDbcp(){
		BasicDataSource ds = new BasicDataSource();
		ds.setUsername("xielong");
		ds.setPassword("123456");
		return ds;
	}
}
