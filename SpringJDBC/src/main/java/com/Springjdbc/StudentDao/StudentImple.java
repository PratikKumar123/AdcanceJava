package com.Springjdbc.StudentDao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.spring.Enities.Student;

public class StudentImple implements StudentDao {


	private JdbcTemplate jdbcTemplate;
	public int insert(Student std) {
		String q1 = "insert into student(id,name,email,location)values(?,?,?,?)";
		int r = this.jdbcTemplate.update(q1,std.getId(),std.getName(),std.getEmail(),std.getLocation());
		return r;
	}
	
	
	public int update(Student std) {
		String q2 = "update student set name=? , location=? where id=?";
		int r = this.jdbcTemplate.update(q2,std.getName(),std.getLocation(),std.getId());
		
		return r;
	}
	
	public int delete(int id) {
		String q2 = "delete from  student  where id=?";
		
		int r = this.jdbcTemplate.update(q2,id);
		
		return r;
	}
	
	


	public Student getStudent(int stdid) {
		String q3 = "select *  from  student  where id=?";
		RowMapper<Student> rowMapper = new RowMapperImpl();
		Student  ss= this.jdbcTemplate.queryForObject(q3, rowMapper,stdid);
		return ss;
	}
	
	

	public List<Student> getallStudent() {

		String q4 = "select *  from  student";
		List<Student> std = this.jdbcTemplate.query(q4, new RowMapperImpl());
		return std;
	}
	
	
	
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}






	



}
