package com.example.checkpoint1.services;

import com.example.checkpoint1.repositories.StudentRepository;
import com.example.checkpoint1.entities.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    public Collection<Student> retrieveStudents() {
        return studentRepository.findAll();
    }
}
