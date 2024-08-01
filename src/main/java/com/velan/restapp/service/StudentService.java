package com.velan.restapp.service;

import java.util.List;
import com.velan.restapp.model.Student;

public interface StudentService {
	public String addStudent(Student stud);
	public List<Student> getAllStudent();
	public Student getStudent(int id);
	public String updateStudent(Student stud);
	public String deleteStudent(int id);	
}

