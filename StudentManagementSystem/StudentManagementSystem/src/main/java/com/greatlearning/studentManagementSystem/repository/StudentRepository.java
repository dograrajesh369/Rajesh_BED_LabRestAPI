package com.greatlearning.studentManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatlearning.studentManagementSystem.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
