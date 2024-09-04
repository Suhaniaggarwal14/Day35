package com.graymatter.entities;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.graymatter.dto.Student;

@FeignClient(name="StudentMicroservice" )
public interface CourseClient {
	
//	@GetMapping("/courses")
//    public List<Course> getAllCourses() ;
     
    @GetMapping("/api/v1/courses/{cid}")
    public List<Student> getStudentsByCourseById(@PathVariable("cid") int cid) ;
     
//    @PostMapping("/add")
//    public Course addCourse(@RequestBody Course course) ;
        
    

}
