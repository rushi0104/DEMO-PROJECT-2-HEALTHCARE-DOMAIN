package com.rushikesh_demo_project_2.healthcare_system;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HealthcareSystemService {

	@Autowired
	HealthcareSystemRepository doctorRepository;

	public Doctor registerDoctor(Doctor doctor) {
		return doctorRepository.save(doctor);
	}

	public Doctor createDoctor() {
		Doctor doctor = new Doctor("MP1110", "Rushikesh", "Neurologist", "15 Years");
		return doctorRepository.save(doctor);
	}

	public Doctor getDoctorDetails(String doctorRegistrationId) {
		// TODO Auto-generated method stub
		return doctorRepository.findById(doctorRegistrationId).get();
	}

	public Doctor registerDummyDoctor() {
		Doctor doctor = new Doctor("MP1110", "Rushikesh", "Neurologist", "15 Years");
		return doctor;
	}

	public String sayHello() {
		return "Hello from Doctor Rushikesh";
	}

}
