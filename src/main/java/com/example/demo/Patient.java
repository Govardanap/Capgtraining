package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Patient {
	String pid;
	String pname;
	String disease; 
	String gender;
	String admit_status;
	int age;

	public Patient() {
		// TODO Auto-generated constructor stub
	}

	public Patient(String pid, String pname, String disease, String gender, String admit_status, int age) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.disease = disease;
		this.gender = gender;
		this.admit_status = admit_status;
		this.age = age;
	}

	public String getPid() {
		return pid;
	}
	@Value("${pid}")
	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}
	@Value("${pname}")
	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getDisease() {
		return disease;
	}
	@Value("${disease}")
	public void setDisease(String disease) {
		this.disease = disease;
	}

	public String getGender() {
		return gender;
	}
	@Value("${gender}")
	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAdmit_status() {
		return admit_status;
	}
	@Value("${admit_status}")
	public void setAdmit_status(String admit_status) {
		this.admit_status = admit_status;
	}

	public int getAge() {
		return age;
	}
	@Value("${age}")
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Patient [pid=" + pid + ", pname=" + pname + ", disease=" + disease + ", gender=" + gender
				+ ", admit_status=" + admit_status + ", age=" + age + "]";
	}

}
