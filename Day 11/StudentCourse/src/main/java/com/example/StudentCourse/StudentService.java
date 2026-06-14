package com.example.StudentCourse;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
@Service
public class StudentService {

    private final StudentRepository repo;

    public StudentService(StudentRepository repo){
        this.repo = repo;
    }
    public List<Student> findAll(){
        return repo.findAll();
    }

    public Student save(Student s){
        return repo.save(s);
    }
}