package com.example.FullStackApplication1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;
@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private StudentService service;
    @GetMapping
    public List<Student> getAll(){
        return service.findAll();
    }
    @PostMapping
    public Student save(@RequestBody Student s){
        return service.save(s);
    }
}
