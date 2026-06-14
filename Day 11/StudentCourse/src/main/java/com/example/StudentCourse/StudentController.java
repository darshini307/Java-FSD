package com.example.StudentCourse;

import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/student")
public class StudentController {
    private final StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }
    @GetMapping
    public List<Student> getStudents(){
        return service.findAll();
    }
    @PostMapping
    public Student postStudent(@RequestBody Student s){
        return service.save(s);
    }

}
