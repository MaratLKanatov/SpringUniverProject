package com.example.spring_univer_project.repository;

import com.example.spring_univer_project.model.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
