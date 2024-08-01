package com.velan.restapp.model;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "student")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Stud ID")
	private int sid;
	@Column(name="Stud Name")
	private String sname;
	@Column(name="Stud Dept")
	private String dept;
	@Column(name="Stud Sec")
	private String section;
	
	
	@OneToOne(targetEntity = Attendance.class  , cascade = CascadeType.ALL)
	@JoinColumn(name="aid")
	private Attendance attend;
	
	public Student() {
		super();
	}

	public Student(int sid, String sname, String dept, String section, Attendance attend) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.dept = dept;
		this.section = section;
		this.attend = attend;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public Attendance getAttend() {
		return attend;
	}

	public void setAttend(Attendance attend) {
		this.attend = attend;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", dept=" + dept + ", section=" + section + ", attend="
				+ attend + "]";
	}
}
