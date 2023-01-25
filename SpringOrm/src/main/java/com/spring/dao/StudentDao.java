package com.spring.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.spring.entities.Student;

public class StudentDao {

	private HibernateTemplate hibernateTempate;

	@Transactional
	public int insert(Student student) {

		hibernateTempate.save(student);
		return 0;
	}

	//get single data
	public Student getStudent(int stdId) {

		Student s = hibernateTempate.get(Student.class, stdId);
		return s;
	}
	//get multiple data
	public List<Student> getAllStudent() {

		List<Student> s = hibernateTempate.loadAll(Student.class);
		return s;
	}
	//delete
	@Transactional
	public void deleteStudent(int  stdId) {
		Student s = hibernateTempate.get(Student.class, stdId);
		hibernateTempate.delete(s);
	}
	//update
	@Transactional
	public void updateStudent(Student std) {
		List<Student> s = hibernateTempate.loadAll(Student.class);
		hibernateTempate.update(s);
	}

	public HibernateTemplate getHibernateTempate() {
		return hibernateTempate;
	}

	public void setHibernateTempate(HibernateTemplate hibernateTempate) {
		this.hibernateTempate = hibernateTempate;
	}

}
