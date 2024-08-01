package com.velan.restapp.serviceimp;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.velan.restapp.model.Attendance;
import com.velan.restapp.repository.AttendanceRepo;
import com.velan.restapp.service.AttendenceService;

@Service
public class AttendanceServiceImp implements AttendenceService {

	@Autowired
	AttendanceRepo repo;

	@Override
	public String addAttendance(Attendance attend) {
		return repo.save(attend);
	}

	@Override
	public Attendance getAttendance(int id) {
		return repo.findById(id);
	}

	@Override
	public List<Attendance> getAllAttendance() {
		return repo.findAllAttendance();
	}

	@Override
	public String updateAttendance(Attendance attend) {
		return repo.update(attend);
	}

	@Override
	public String deleteAttendance(int id) {
		return repo.delete(id);
	}

	public List<Integer> getAllId() {
		return repo.getIdList();
	}

}
