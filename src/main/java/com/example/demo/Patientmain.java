package com.example.demo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Patientmain {
	public static void main(String[] args) {
		 ApplicationContext context = new AnnotationConfigApplicationContext(com.example.demo.AppConfig.class);
	     PatientService patientService = context.getBean(PatientService.class);
	     patientService.getPatientDetails();
	}

}
