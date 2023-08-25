package com.rushikesh_demo_project_2.healthcare_system;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthcareSystemController {

	@Autowired
	HealthcareSystemService doctorService;

	@GetMapping("/hello")
	public String sayHello() {
		return "Hello from Doctor Shubham";
	}

	@GetMapping("/createDoctor")
	public Doctor createDoctor() {
		return doctorService.createDoctor();
	}

	@PostMapping("/registerDoctor")
	public Doctor registerDoctor(@RequestBody Doctor doctor) {
		return doctorService.registerDoctor(doctor);
	}

	@GetMapping("/getDoctor/{doctorRegistrationId}")
	public Doctor getDoctor(@PathVariable String doctorRegistrationId) {
		return doctorService.getDoctorDetails(doctorRegistrationId);
	}

}
