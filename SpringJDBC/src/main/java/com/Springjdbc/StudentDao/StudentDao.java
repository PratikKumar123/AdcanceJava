package com.Springjdbc.StudentDao;

import java.util.List;

import com.spring.Enities.Student;

public interface StudentDao {
	public int insert(Student std);

	public int update(Student std);
	
	public int delete(int id);
	public Student getStudent(int stdid);
	
	public List<Student> getallStudent();
}
