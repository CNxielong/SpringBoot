package cn.xdl.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
public class JdbcTemplateConfig {

	@Bean("template1")
	@Autowired
	public JdbcTemplate createDbcp1Template(@Qualifier("dbcp1") DataSource dataSource){
		System.out.println("template1");
		return new JdbcTemplate(dataSource);
	}
	
	@Bean("template2")
	@Autowired
	public JdbcTemplate createDbcp2Template(@Qualifier("dbcp2") DataSource dataSource){
		System.out.println("template2");
		return new JdbcTemplate(dataSource);
	}
}
