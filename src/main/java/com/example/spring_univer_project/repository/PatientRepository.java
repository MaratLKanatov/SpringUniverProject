package com.example.spring_univer_project.repository;

import com.example.spring_univer_project.model.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {
}
