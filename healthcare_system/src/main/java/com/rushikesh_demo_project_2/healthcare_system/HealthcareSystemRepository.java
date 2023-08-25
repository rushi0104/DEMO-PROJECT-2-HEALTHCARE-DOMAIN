package com.rushikesh_demo_project_2.healthcare_system;

import org.springframework.data.jpa.repository.JpaRepository;

public interface HealthcareSystemRepository extends JpaRepository<Doctor, String> {

}
