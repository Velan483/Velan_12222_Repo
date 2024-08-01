package com.velan.restapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "attendance")
public class Attendance {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Attendance Id")
	private int aid;
	@Column(name = "Date")
	private String date;
	@Column(name="Day")
	private String day;
	@Column(name="Attendence")
	private String attend;
	

	public Attendance() {
		super();
	}


	public Attendance(int aid, String date, String day, String attend) {
		super();
		this.aid = aid;
		this.date = date;
		this.day = day;
		this.attend = attend;
	}


	public int getAid() {
		return aid;
	}


	public void setAid(int aid) {
		this.aid = aid;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public String getDay() {
		return day;
	}


	public void setDay(String day) {
		this.day = day;
	}


	public String getAttend() {
		return attend;
	}


	public void setAttend(String attend) {
		this.attend = attend;
	}


	@Override
	public String toString() {
		return "Attendance [aid=" + aid + ", date=" + date + ", day=" + day + ", attend=" + attend + "]";
	}

	
}
