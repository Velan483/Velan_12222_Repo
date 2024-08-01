package com.velan.restapp.repository;

import java.util.List;
import org.springframework.stereotype.Repository;
import com.velan.restapp.model.Student;

@Repository
public interface StudentRepo{

    public String save(Student stud);
	public List<Student> findAllStudents();
	public Student findById(int id);
	public String update(Student stud);
	public String delete(int id);
	
}

