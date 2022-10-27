package com.example.spring_univer_project.repository;

import com.example.spring_univer_project.model.entities.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {
}
