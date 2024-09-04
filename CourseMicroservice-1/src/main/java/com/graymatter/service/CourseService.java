package com.graymatter.service;
 
import java.util.ArrayList;
import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
 
import com.graymatter.dto.Student;
import com.graymatter.entities.Course;
import com.graymatter.entities.CourseClient;
import com.graymatter.repositories.CourseRepository;
 
@Service
public class CourseService {
 
	@Autowired
	CourseRepository repository;
//	
//	@Autowired
//	RestTemplate restTemplate;
	
	@Autowired
	CourseClient client;
	
	public List<Course> getAllCourses() {
		return repository.findAll();
	}
	public Course getCourseById(int cid) {
		Course course = repository.findById(cid).get();
//		List<Student> studentList = (List<Student>) restTemplate.getForObject("http://StudentService/"+cid, ArrayList.class);
		List<Student> studentList=client.getStudentsByCourseById(cid);
		course.setStudentList(studentList);
		return course;
	}
	public Course addCourse(Course course) {
		return repository.save(course);
	}
}