package cn.xdl.config;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Configuration
public class DataSourceConfig {

	@Bean("dbcp1")
	@ConfigurationProperties(prefix="db.datasource1")
	@Primary
	public DataSource createDbcp1(){
		DataSource dataSource = DataSourceBuilder.create().type(BasicDataSource.class).build();
		return dataSource;
	}
	
	@Bean(name="dbcp2")
	@ConfigurationProperties(prefix="db.datasource2")
	public DataSource createDbcp2(){
		DataSource dataSource = DataSourceBuilder.create().type(BasicDataSource.class).build();
		return dataSource;
	}
	
}
