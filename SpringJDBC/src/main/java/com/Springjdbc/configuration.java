package com.Springjdbc;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.Springjdbc.StudentDao.StudentDao;
import com.Springjdbc.StudentDao.StudentImple;

@Configuration
public class configuration {
	
	@Bean
	public DataSource getdatas() {
		DriverManagerDataSource d = new DriverManagerDataSource();
		d.setDriverClassName("com.mysql.jdbc.Driver");
		d.setUrl("jdbc:mysql://localhost:3306/springjdbc");
		d.setUsername("root");
		d.setPassword("root");
		
		return d;
	}
	@Bean
	public JdbcTemplate getTemp() {
		
		JdbcTemplate jdbct = new JdbcTemplate();
		
		jdbct.setDataSource(getdatas());
		return jdbct;
		
	}
	@Bean(name = "std")
	public StudentDao getStudent() {
		StudentImple st = new StudentImple();
		st.setJdbcTemplate(getTemp());
		return st;
	}
}
