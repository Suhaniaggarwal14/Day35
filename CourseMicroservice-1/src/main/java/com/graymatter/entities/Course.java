package com.graymatter.entities;

import java.util.List;

import com.graymatter.dto.Student;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Entity
public class Course {
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	
	private int cid;
	private String CourseName;
	@Transient
	private List<Student> studentList;

}
