package com.rushikesh_demo_project_2.healthcare_system;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class HealthcareSystemApplicationTests {

	@Autowired
	HealthcareSystemService doctorService;

	@Test
	void contextLoads() {
	}

	@Test
	void testService() {
		assertEquals(doctorService.sayHello(), "Hello from Doctor Rushikesh");
	}
}
