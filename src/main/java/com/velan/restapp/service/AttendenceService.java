package com.velan.restapp.service;

import java.util.List;
import com.velan.restapp.model.Attendance;

public interface AttendenceService {

	public String addAttendance(Attendance attend);
	public Attendance getAttendance(int id);
	public List<Attendance> getAllAttendance();
	public String updateAttendance(Attendance attend);
	public String deleteAttendance(int id);

}
