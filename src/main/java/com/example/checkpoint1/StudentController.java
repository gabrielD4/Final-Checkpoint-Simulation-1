package com.example.checkpoint1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/v1/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping
    public Student insertNewStudent(@RequestBody Student student) {
        return studentService.createStudent(student);
    }

    @GetMapping
    public Collection<Student> retrieveAllStudents(){
        return studentService.retrieveStudents();
    }
}
