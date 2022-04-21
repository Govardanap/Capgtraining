package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class PatientService {
Patient patient;
	
	public Patient getPatient() {
		return patient;
	}
	
	@Autowired
	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public int getPatientDetails() {
		String result = "Patient Id  " + patient.getPid() +
                "\n Patient Name  " + patient.getPname() +
                "\nDisease " + patient.getDisease() +
                "\nGender " + patient.getGender() +
                "\nAdmit Status " + patient.getAdmit_status() +
                "\nAge " + patient.getAge();
        System.out.println(result);
		//result one way is out
	}

}
