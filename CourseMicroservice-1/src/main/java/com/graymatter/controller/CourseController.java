package com.graymatter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.graymatter.entities.Course;
import com.graymatter.service.CourseService;

@RestController
@RequestMapping("/api/v1")
public class CourseController {

    @Autowired
    private CourseService service;

    // Get all courses
    @GetMapping("/courses")
    public List<Course> getAllCourses() {
        return service.getAllCourses();
    }

    // Get course by ID
    @GetMapping("/courses/{cid}")
    public Course getCourseById(@PathVariable("cid") int cid) {
        return service.getCourseById(cid);
    }

    // Add a new course
    @PostMapping("/add")
    public Course addCourse(@RequestBody Course course) {
        return service.addCourse(course);
    }

}
