package com.velan.restapp.repositoryimp;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.velan.restapp.model.Student;
import com.velan.restapp.repository.StudentRepo;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class StudentRepoImp implements StudentRepo {

	@Autowired
	EntityManager em;
	
	static final String SUCCESS="success";
	static final String FAILURE="failure";
	
	@Override
	public String save(Student stud) {
		if(stud!=null) {
		    em.merge(stud);
		    return SUCCESS;
		}
		else {
			return FAILURE;
		}
	}

	@Override
	public List<Student> findAllStudents() {
		String hql = "from Student";
		Query query = em.createQuery(hql);
		return query.getResultList();
	}

	@Override
	public Student findById(int id) {
		return em.find(Student.class, id);
	}
	@Override
	public String update(Student stud) {
		if(stud!=null) {
		   em.merge(stud);
		   return SUCCESS;
		}
		else {
			return FAILURE;
		}
	}
	@Override
	public String delete(int id) {
		Student stud= em.find(Student.class,id);
		if(stud!=null){
			em.remove(stud);
			return SUCCESS;
		}
		else {
			return FAILURE;
		}
	}
}

