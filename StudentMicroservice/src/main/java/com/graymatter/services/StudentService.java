package com.graymatter.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.graymatter.entities.Student;
import com.graymatter.repositories.StudentRepository;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository repository;

    public List<Student> getAllStudents() {
        return repository.findAll();
    }

    public List<Student> getAllStudentsByCourseId(int cid) {
       
        return repository.findByCourseId(cid);
    }

    public Student addStudent(Student student) {
        return repository.save(student);
    }
}
