package com.graymatter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.graymatter.entities.Student;
import com.graymatter.services.StudentService;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class StudentController {

    @Autowired
    private StudentService service;

    // Get all students
    @GetMapping("/students")
    public List<Student> getAllStudents() {
        return service.getAllStudents();
    }

    // Get students by course ID
    @GetMapping("/students/course/{cid}")
    public List<Student> getAllStudentsByCourseId(@PathVariable("cid") int cid) {
        return service.getAllStudentsByCourseId(cid);
    }

    // Add a new student
    @PostMapping("/students/add")
    public Student addStudent(@RequestBody Student student) {
        return service.addStudent(student);
    }
}
