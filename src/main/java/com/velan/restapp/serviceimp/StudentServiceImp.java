package com.velan.restapp.serviceimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velan.restapp.model.Student;
import com.velan.restapp.repository.StudentRepo;
import com.velan.restapp.service.StudentService;

@Service
public class StudentServiceImp implements StudentService {

	@Autowired
	StudentRepo repo;

	@Override
	public String addStudent(Student stud) {
		return repo.save(stud);
	}

	@Override
	public Student getStudent(int id) {
		return repo.findById(id);
	}

	@Override
	public List<Student> getAllStudent() {
		return repo.findAllStudents();
	}

	@Override
	public String updateStudent(Student stud) {
		return repo.update(stud);
	}

	@Override
	public String deleteStudent(int id) {
		return repo.delete(id);
	}

}
