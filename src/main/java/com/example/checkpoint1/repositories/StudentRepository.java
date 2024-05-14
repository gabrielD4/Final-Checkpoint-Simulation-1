package com.example.checkpoint1.repositories;

import com.example.checkpoint1.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
