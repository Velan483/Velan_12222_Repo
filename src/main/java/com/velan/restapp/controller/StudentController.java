package com.velan.restapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.velan.restapp.model.Student;
import com.velan.restapp.serviceimp.StudentServiceImp;


@RestController
@RequestMapping("/student")
@CrossOrigin("http://localhost:3000")
public class StudentController {

	@Autowired
    StudentServiceImp service;

	static final String SUCCESS="Success";
	static final String FAILURE="Failure";
	
	@PostMapping
	public String insertStudent(@RequestBody Student stud) {
		String msg = "";

		try {
			service.addStudent(stud);
			msg=SUCCESS;
		} catch (Exception e) {
			msg = FAILURE;
		}
		return msg;
	}
	
	@GetMapping("{id}")
	public Student getStudentById(@PathVariable("id") int id) {

		return service.getStudent(id);

	}

	@GetMapping("/all")
	public List<Student> getStudent() {

		return service.getAllStudent();

	}
	
	@PutMapping()
	public String updateStudent(@RequestBody Student stud) {
		String msg = "";

		try {
			service.updateStudent(stud);
			msg = SUCCESS;
		}

		catch (Exception e) {
			msg = FAILURE;
		}
		return msg;
	}
	
	
	
	@DeleteMapping("{id}")
	public String deleteStudentById(@PathVariable("id")int id) {
		String msg="";
		try {
			service.deleteStudent(id);
			msg=SUCCESS;
		} catch (Exception e) {
			msg=FAILURE;
		}
		return msg;
	}
	
	
}
