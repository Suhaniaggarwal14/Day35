package com.graymatter.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.graymatter.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>

{

	List<Student> findByCourseId(int cid);

}
