package com.greatlearning.studentManagementSystem.service;

import java.util.List;

import javax.transaction.Transactional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.greatlearning.studentManagementSystem.entity.Student;
import com.greatlearning.studentManagementSystem.repository.StudentRepository;

@Repository
public class StudentServiceImpl implements StudentService {
	@Autowired
	StudentRepository studentRepository;

	@Transactional
	public List<Student> findAll() {

		List<Student> students = studentRepository.findAll();

		return students;
	}

	@Transactional
	public Student findById(int id) {

		Student student = new Student();
		student = studentRepository.findById(id).get();
		return student;
	}

	@Transactional
	public void save(Student theStudent) {
		studentRepository.save(theStudent);

	}

	@Transactional
	public void deleteById(int id) {
		studentRepository.deleteById(id);

	}

}
