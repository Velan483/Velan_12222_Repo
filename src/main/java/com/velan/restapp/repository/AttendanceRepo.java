package com.velan.restapp.repository;

import java.util.List;
import org.springframework.stereotype.Repository;
import com.velan.restapp.model.Attendance;

@Repository
public interface AttendanceRepo{

	public String save(Attendance attend);
	public List<Attendance> findAllAttendance();
	public Attendance findById(int id);
	public String update(Attendance attend);
	public String delete(int id);
	public List<Integer> getIdList();
}
