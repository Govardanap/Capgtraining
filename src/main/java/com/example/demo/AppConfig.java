package com.example.demo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
@Configuration
@PropertySource("classpath:application.properties")
public class AppConfig {
	@Bean
	Patient patient() {
        return new Patient();
    }

    @Bean
    PatientService patientService() {
        return new PatientService();
    }

}
