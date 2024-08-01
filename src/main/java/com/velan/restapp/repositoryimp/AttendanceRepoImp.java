package com.velan.restapp.repositoryimp;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.velan.restapp.model.Attendance;
import com.velan.restapp.repository.AttendanceRepo;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class AttendanceRepoImp implements AttendanceRepo {

	@Autowired
	EntityManager em;
	
	static final String SUCCESS="success";
	static final String FAILURE="failure";

	@Override
	public String save(Attendance attend) {
		if(attend!=null) {
		    em.merge(attend);
		    return SUCCESS;
		}
		else {
			return FAILURE;
		}
	}

	@Override
	public List<Attendance> findAllAttendance() {
		String hql = "from Attendance";
		Query query = em.createQuery(hql);
		return query.getResultList();
	}

	@Override
	public List<Integer> getIdList() {
		String hql="select aid from Attendance";
		Query query = em.createQuery(hql);
		return query.getResultList();
	}

	@Override
	public Attendance findById(int id) {
		return em.find(Attendance.class, id);
	}

	@Override
	public String update(Attendance attend) {
		if(attend!=null) {
		    em.merge(attend);
		    return SUCCESS;
		}
		else {
			return FAILURE;
		}
	}

	@Override
	public String delete(int id) {
		Attendance p = em.find(Attendance.class, id);
		if(p!=null) {
		    em.remove(p);
		    return SUCCESS;
		}
		else {
			return FAILURE;
		}
	}

}
