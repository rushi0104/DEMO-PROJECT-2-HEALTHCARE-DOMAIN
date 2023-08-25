package com.rushikesh_demo_project_2.healthcare_system;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestHealthcareSystemService {

	@Autowired
	HealthcareSystemService doctorService;

	@Test
	public void testRegisterDoctor() {
		Doctor doctor = new Doctor("MP1110", "Rushikesh", "Neurologist", "15 Years");
		assertEquals(doctor.getDoctorRegistrationId(), doctorService.registerDummyDoctor().getDoctorRegistrationId());
	}

}
